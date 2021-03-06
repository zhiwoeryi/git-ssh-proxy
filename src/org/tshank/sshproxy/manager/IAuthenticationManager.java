/*
 * Copyright 2013 gitblit.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.tshank.sshproxy.manager;


import org.tshank.sshproxy.models.UserModel;
import org.tshank.sshproxy.ssh.SshKey;


public interface IAuthenticationManager{

	/**
	 * Authenticate a user based on a ssh public key.
	 *
	 * @param username
	 * @param key
	 * @return a user object or null
* 	 * @since 1.5.0
	 */
	UserModel authenticate(String username, SshKey key);
}