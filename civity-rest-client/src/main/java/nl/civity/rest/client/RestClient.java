/*
 * Copyright (c) 2021, Civity
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 * * Neither the name of the copyright holder nor the names of its contributors 
 *   may be used to endorse or promote products derived from this software without 
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package nl.civity.rest.client;

import java.util.Map;

/**
 * RestClient to delete/get/patch/post/put data to/from a HTTP server. 
 * @author basvanmeulebrouk
 */
public interface RestClient {

    String deleteHttp(String uri, Map<String, String> headers, Map<String, String> parameters, int[] expectedReturnCodes) throws RestClientException;
    
    String getHttp(String uri, Map<String, String> headers, Map<String, String> parameters, int[] expectedReturnCodes) throws RestClientException;

    String patchHttp(String uri, Map<String, String> headers, Map<String, String> parameters, int[] expectedReturnCodes, String body) throws RestClientException;

    String postHttp(String uri, Map<String, String> headers, Map<String, String> parameters, int[] expectedReturnCodes, String body) throws RestClientException;

    String putHttp(String uri, Map<String, String> headers, Map<String, String> parameters, int[] expectedReturnCodes, String body) throws RestClientException;

    String deleteHttp(String uri, Map<String, String> headers, Map<String, String> parameters, int expectedReturnCode) throws RestClientException;
    
    String getHttp(String uri, Map<String, String> headers, Map<String, String> parameters, int expectedReturnCode) throws RestClientException;

    String patchHttp(String uri, Map<String, String> headers, Map<String, String> parameters, int expectedReturnCode, String body) throws RestClientException;

    String postHttp(String uri, Map<String, String> headers, Map<String, String> parameters, int expectedReturnCode, String body) throws RestClientException;

    String putHttp(String uri, Map<String, String> headers, Map<String, String> parameters, int expectedReturnCode, String body) throws RestClientException;
}
