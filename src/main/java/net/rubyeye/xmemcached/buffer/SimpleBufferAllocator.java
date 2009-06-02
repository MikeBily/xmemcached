/**
 *Copyright [2009-2010] [dennis zhuang(killme2008@gmail.com)]
 *Licensed under the Apache License, Version 2.0 (the "License");
 *you may not use this file except in compliance with the License. 
 *You may obtain a copy of the License at 
 *             http://www.apache.org/licenses/LICENSE-2.0 
 *Unless required by applicable law or agreed to in writing, 
 *software distributed under the License is distributed on an "AS IS" BASIS, 
 *WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 *either express or implied. See the License for the specific language governing permissions and limitations under the License
 */
package net.rubyeye.xmemcached.buffer;

import java.nio.ByteBuffer;

/**
 * 简单ByteBuffer分配器
 * 
 * @author dennis
 * 
 */
public class SimpleBufferAllocator implements BufferAllocator {

	public final IoBuffer allocate(int capacity) {
		return wrap(ByteBuffer.allocate(capacity));
	}

	public final void dispose() {
	}

	public final static BufferAllocator newInstance() {
		return new SimpleBufferAllocator();
	}

	@Override
	public final IoBuffer wrap(ByteBuffer byteBuffer) {
		return new SimpleIoBuffer(byteBuffer);
	}

}
