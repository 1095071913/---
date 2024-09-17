/*
 * Copyright 2012-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.maozi.base;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CodeData<D> implements Serializable {

	private static final long serialVersionUID = 7953425100947733968L;

	private Integer code;

	private String targetCode;

	private String message;

	private D data;
	
	public CodeData(String message) {
		this.code = 400;
		this.message = message;
	} 

	public CodeData(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public CodeData(Integer code, String message,D data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

}