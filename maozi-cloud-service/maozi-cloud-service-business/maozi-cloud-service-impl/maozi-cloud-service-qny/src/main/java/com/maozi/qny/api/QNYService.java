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

package com.maozi.qny.api;

import java.io.File;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;



public interface QNYService {
	
	List<String> uploadImages(MultipartFile [] files) throws Exception;
	
	String uploadImage(MultipartFile file) throws Exception;

	/**
	 * 上传图片
	 * @param files
	 * @return
	 */
	List<String> uploadImages(MultipartRequest files);

	/**
	 * 上传文件
	 * @param bytes
	 * @return
	 * @throws Exception
	 */
	String uploadImage(byte[] bytes) throws Exception;

	/**
	 * 根据url下载图片
	 * @param url
	 * @return
	 */
	File download(String url);

}
