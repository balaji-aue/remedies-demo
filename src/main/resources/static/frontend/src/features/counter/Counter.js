import React, { useState } from 'react';
import { useSelector, useDispatch } from 'react-redux';
import {
  decrement,
  increment,
  incrementByAmount,
  incrementAsync,
  selectCount,
} from './counterSlice';
import styles from './Counter.module.css';

export function Counter() {

  const count = useSelector(selectCount);
  const dispatch = useDispatch();
  const [incrementAmount, setIncrementAmount] = useState('2');

  const getapivalue = ()=>fetch(`./button/fetch`).then(response=>response.json()).then(res=>{
    dispatch(setIncrementAmount(res.data))
  })

  return (
    <div>
      <div className={styles.row}>
        <button
          className={styles.button}
          onClick={() =>
            getapivalue()
          }
        >
          Fetch value
        </button>
        <div>Api value here:{incrementAmount}</div>
      </div>
    </div>
  );
}
