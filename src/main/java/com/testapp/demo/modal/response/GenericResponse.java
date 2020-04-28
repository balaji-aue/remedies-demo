package com.testapp.demo.modal.response;

public class GenericResponse {
	private GenericResponseStatus status = GenericResponseStatus.SUCCESS;
	private Object data;
	
	public GenericResponse(Object data) {
		this.data = data;
	}

	public GenericResponseStatus getStatus() {
		return status;
	}

	public void setStatus(GenericResponseStatus status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
