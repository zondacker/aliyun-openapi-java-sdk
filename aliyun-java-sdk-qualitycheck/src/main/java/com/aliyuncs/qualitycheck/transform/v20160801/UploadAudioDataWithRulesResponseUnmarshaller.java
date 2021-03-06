/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.qualitycheck.transform.v20160801;

import com.aliyuncs.qualitycheck.model.v20160801.UploadAudioDataWithRulesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadAudioDataWithRulesResponseUnmarshaller {

	public static UploadAudioDataWithRulesResponse unmarshall(UploadAudioDataWithRulesResponse uploadAudioDataWithRulesResponse, UnmarshallerContext context) {
		
		uploadAudioDataWithRulesResponse.setRequestId(context.stringValue("UploadAudioDataWithRulesResponse.requestId"));
		uploadAudioDataWithRulesResponse.setSuccess(context.booleanValue("UploadAudioDataWithRulesResponse.success"));
		uploadAudioDataWithRulesResponse.setCode(context.stringValue("UploadAudioDataWithRulesResponse.code"));
		uploadAudioDataWithRulesResponse.setMessage(context.stringValue("UploadAudioDataWithRulesResponse.message"));
		uploadAudioDataWithRulesResponse.setData(context.stringValue("UploadAudioDataWithRulesResponse.data"));
	 
	 	return uploadAudioDataWithRulesResponse;
	}
}