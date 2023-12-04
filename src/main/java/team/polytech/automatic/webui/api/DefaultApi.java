package team.polytech.automatic.webui.api;

import team.polytech.automatic.webui.invoker.ApiClient;

import team.polytech.automatic.webui.model.CreateResponse;
import team.polytech.automatic.webui.model.EmbeddingsResponse;
import team.polytech.automatic.webui.model.Estimation;
import team.polytech.automatic.webui.model.ExtrasBatchImagesRequest;
import team.polytech.automatic.webui.model.ExtrasBatchImagesResponse;
import team.polytech.automatic.webui.model.ExtrasSingleImageRequest;
import team.polytech.automatic.webui.model.ExtrasSingleImageResponse;
import team.polytech.automatic.webui.model.FaceRestorerItem;
import java.io.File;
import team.polytech.automatic.webui.model.Flags;
import team.polytech.automatic.webui.model.HTTPValidationError;
import team.polytech.automatic.webui.model.HypernetworkItem;
import team.polytech.automatic.webui.model.ImageToImageResponse;
import team.polytech.automatic.webui.model.InterrogateRequest;
import team.polytech.automatic.webui.model.LatentUpscalerModeItem;
import team.polytech.automatic.webui.model.MemoryResponse;
import team.polytech.automatic.webui.model.ModulesApiModelsProgressResponse;
import team.polytech.automatic.webui.model.ModulesProgressProgressResponse;
import team.polytech.automatic.webui.model.Options;
import team.polytech.automatic.webui.model.PNGInfoRequest;
import team.polytech.automatic.webui.model.PNGInfoResponse;
import team.polytech.automatic.webui.model.PredictBody;
import team.polytech.automatic.webui.model.PreprocessResponse;
import team.polytech.automatic.webui.model.ProgressRequest;
import team.polytech.automatic.webui.model.PromptStyleItem;
import team.polytech.automatic.webui.model.QuicksettingsHint;
import team.polytech.automatic.webui.model.RealesrganItem;
import team.polytech.automatic.webui.model.ResetBody;
import team.polytech.automatic.webui.model.SDModelItem;
import team.polytech.automatic.webui.model.SDVaeItem;
import team.polytech.automatic.webui.model.SamplerItem;
import team.polytech.automatic.webui.model.ScriptInfo;
import team.polytech.automatic.webui.model.ScriptsList;
import team.polytech.automatic.webui.model.StableDiffusionProcessingImg2Img;
import team.polytech.automatic.webui.model.StableDiffusionProcessingTxt2Img;
import team.polytech.automatic.webui.model.TextToImageResponse;
import team.polytech.automatic.webui.model.TrainResponse;
import team.polytech.automatic.webui.model.UpscalerItem;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-27T02:28:26.857180667+03:00[Europe/Moscow]")
@Component("team.polytech.automatic.webui.api.DefaultApi")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    @Autowired
    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Api Info
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param serialize  (optional, default to true)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object apiInfoInfoGet(Boolean serialize) throws RestClientException {
        return apiInfoInfoGetWithHttpInfo(serialize).getBody();
    }

    /**
     * Api Info
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param serialize  (optional, default to true)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> apiInfoInfoGetWithHttpInfo(Boolean serialize) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "serialize", serialize));


        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/info", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Api Info
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param serialize  (optional, default to true)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object apiInfoInfoGet_0(Boolean serialize) throws RestClientException {
        return apiInfoInfoGet_0WithHttpInfo(serialize).getBody();
    }

    /**
     * Api Info
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param serialize  (optional, default to true)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> apiInfoInfoGet_0WithHttpInfo(Boolean serialize) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "serialize", serialize));


        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/info/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * App Id
     * 
     * <p><b>200</b> - Successful Response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object appIdAppIdGet() throws RestClientException {
        return appIdAppIdGetWithHttpInfo().getBody();
    }

    /**
     * App Id
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> appIdAppIdGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/app_id/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * App Id
     * 
     * <p><b>200</b> - Successful Response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object appIdAppIdGet_0() throws RestClientException {
        return appIdAppIdGet_0WithHttpInfo().getBody();
    }

    /**
     * App Id
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> appIdAppIdGet_0WithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/app_id", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Build Resource
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param path  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object buildResourceAssetsPathGet(String path) throws RestClientException {
        return buildResourceAssetsPathGetWithHttpInfo(path).getBody();
    }

    /**
     * Build Resource
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param path  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> buildResourceAssetsPathGetWithHttpInfo(String path) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'path' when calling buildResourceAssetsPathGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("path", path);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/assets/{path}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create Embedding
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param body  (required)
     * @return CreateResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateResponse createEmbeddingSdapiV1CreateEmbeddingPost(Object body) throws RestClientException {
        return createEmbeddingSdapiV1CreateEmbeddingPostWithHttpInfo(body).getBody();
    }

    /**
     * Create Embedding
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param body  (required)
     * @return ResponseEntity&lt;CreateResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateResponse> createEmbeddingSdapiV1CreateEmbeddingPostWithHttpInfo(Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createEmbeddingSdapiV1CreateEmbeddingPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<CreateResponse> localReturnType = new ParameterizedTypeReference<CreateResponse>() {};
        return apiClient.invokeAPI("/sdapi/v1/create/embedding", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create Hypernetwork
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param body  (required)
     * @return CreateResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateResponse createHypernetworkSdapiV1CreateHypernetworkPost(Object body) throws RestClientException {
        return createHypernetworkSdapiV1CreateHypernetworkPostWithHttpInfo(body).getBody();
    }

    /**
     * Create Hypernetwork
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param body  (required)
     * @return ResponseEntity&lt;CreateResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateResponse> createHypernetworkSdapiV1CreateHypernetworkPostWithHttpInfo(Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createHypernetworkSdapiV1CreateHypernetworkPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<CreateResponse> localReturnType = new ParameterizedTypeReference<CreateResponse>() {};
        return apiClient.invokeAPI("/sdapi/v1/create/hypernetwork", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Download Sysinfo
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param attachment  (optional, default to false)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object downloadSysinfoInternalSysinfoGet(Object attachment) throws RestClientException {
        return downloadSysinfoInternalSysinfoGetWithHttpInfo(attachment).getBody();
    }

    /**
     * Download Sysinfo
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param attachment  (optional, default to false)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> downloadSysinfoInternalSysinfoGetWithHttpInfo(Object attachment) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "attachment", attachment));


        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/internal/sysinfo", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Extras Batch Images Api
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param extrasBatchImagesRequest  (required)
     * @return ExtrasBatchImagesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExtrasBatchImagesResponse extrasBatchImagesApiSdapiV1ExtraBatchImagesPost(ExtrasBatchImagesRequest extrasBatchImagesRequest) throws RestClientException {
        return extrasBatchImagesApiSdapiV1ExtraBatchImagesPostWithHttpInfo(extrasBatchImagesRequest).getBody();
    }

    /**
     * Extras Batch Images Api
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param extrasBatchImagesRequest  (required)
     * @return ResponseEntity&lt;ExtrasBatchImagesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExtrasBatchImagesResponse> extrasBatchImagesApiSdapiV1ExtraBatchImagesPostWithHttpInfo(ExtrasBatchImagesRequest extrasBatchImagesRequest) throws RestClientException {
        Object localVarPostBody = extrasBatchImagesRequest;
        
        // verify the required parameter 'extrasBatchImagesRequest' is set
        if (extrasBatchImagesRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'extrasBatchImagesRequest' when calling extrasBatchImagesApiSdapiV1ExtraBatchImagesPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<ExtrasBatchImagesResponse> localReturnType = new ParameterizedTypeReference<ExtrasBatchImagesResponse>() {};
        return apiClient.invokeAPI("/sdapi/v1/extra-batch-images", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Extras Single Image Api
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param extrasSingleImageRequest  (required)
     * @return ExtrasSingleImageResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExtrasSingleImageResponse extrasSingleImageApiSdapiV1ExtraSingleImagePost(ExtrasSingleImageRequest extrasSingleImageRequest) throws RestClientException {
        return extrasSingleImageApiSdapiV1ExtraSingleImagePostWithHttpInfo(extrasSingleImageRequest).getBody();
    }

    /**
     * Extras Single Image Api
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param extrasSingleImageRequest  (required)
     * @return ResponseEntity&lt;ExtrasSingleImageResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExtrasSingleImageResponse> extrasSingleImageApiSdapiV1ExtraSingleImagePostWithHttpInfo(ExtrasSingleImageRequest extrasSingleImageRequest) throws RestClientException {
        Object localVarPostBody = extrasSingleImageRequest;
        
        // verify the required parameter 'extrasSingleImageRequest' is set
        if (extrasSingleImageRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'extrasSingleImageRequest' when calling extrasSingleImageApiSdapiV1ExtraSingleImagePost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<ExtrasSingleImageResponse> localReturnType = new ParameterizedTypeReference<ExtrasSingleImageResponse>() {};
        return apiClient.invokeAPI("/sdapi/v1/extra-single-image", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Favicon
     * 
     * <p><b>200</b> - Successful Response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object faviconFaviconIcoGet() throws RestClientException {
        return faviconFaviconIcoGetWithHttpInfo().getBody();
    }

    /**
     * Favicon
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> faviconFaviconIcoGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/favicon.ico", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Fetch File
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param filename  (optional, default to )
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object fetchFileSdExtraNetworksThumbGet(String filename) throws RestClientException {
        return fetchFileSdExtraNetworksThumbGetWithHttpInfo(filename).getBody();
    }

    /**
     * Fetch File
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param filename  (optional, default to )
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> fetchFileSdExtraNetworksThumbGetWithHttpInfo(String filename) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filename", filename));


        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/sd_extra_networks/thumb", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * File Deprecated
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param path  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object fileDeprecatedFilePathGet(String path) throws RestClientException {
        return fileDeprecatedFilePathGetWithHttpInfo(path).getBody();
    }

    /**
     * File Deprecated
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param path  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> fileDeprecatedFilePathGetWithHttpInfo(String path) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'path' when calling fileDeprecatedFilePathGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("path", path);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/file/{path}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * File
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param pathOrUrl  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object fileFilePathOrUrlGet(String pathOrUrl) throws RestClientException {
        return fileFilePathOrUrlGetWithHttpInfo(pathOrUrl).getBody();
    }

    /**
     * File
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param pathOrUrl  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> fileFilePathOrUrlGetWithHttpInfo(String pathOrUrl) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'pathOrUrl' is set
        if (pathOrUrl == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pathOrUrl' when calling fileFilePathOrUrlGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("path_or_url", pathOrUrl);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/file={path_or_url}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * File
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param pathOrUrl  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object fileFilePathOrUrlHead(String pathOrUrl) throws RestClientException {
        return fileFilePathOrUrlHeadWithHttpInfo(pathOrUrl).getBody();
    }

    /**
     * File
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param pathOrUrl  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> fileFilePathOrUrlHeadWithHttpInfo(String pathOrUrl) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'pathOrUrl' is set
        if (pathOrUrl == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pathOrUrl' when calling fileFilePathOrUrlHead");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("path_or_url", pathOrUrl);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/file={path_or_url}", HttpMethod.HEAD, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Cmd Flags
     * 
     * <p><b>200</b> - Successful Response
     * @return Flags
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flags getCmdFlagsSdapiV1CmdFlagsGet() throws RestClientException {
        return getCmdFlagsSdapiV1CmdFlagsGetWithHttpInfo().getBody();
    }

    /**
     * Get Cmd Flags
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Flags&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Flags> getCmdFlagsSdapiV1CmdFlagsGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<Flags> localReturnType = new ParameterizedTypeReference<Flags>() {};
        return apiClient.invokeAPI("/sdapi/v1/cmd-flags", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Config
     * 
     * <p><b>200</b> - Successful Response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object getConfigConfigGet() throws RestClientException {
        return getConfigConfigGetWithHttpInfo().getBody();
    }

    /**
     * Get Config
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> getConfigConfigGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/config", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Config
     * 
     * <p><b>200</b> - Successful Response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object getConfigConfigGet_0() throws RestClientException {
        return getConfigConfigGet_0WithHttpInfo().getBody();
    }

    /**
     * Get Config
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> getConfigConfigGet_0WithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/config/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Config
     * 
     * <p><b>200</b> - Successful Response
     * @return Options
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Options getConfigSdapiV1OptionsGet() throws RestClientException {
        return getConfigSdapiV1OptionsGetWithHttpInfo().getBody();
    }

    /**
     * Get Config
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Options&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Options> getConfigSdapiV1OptionsGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<Options> localReturnType = new ParameterizedTypeReference<Options>() {};
        return apiClient.invokeAPI("/sdapi/v1/options", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Current User
     * 
     * <p><b>200</b> - Successful Response
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String getCurrentUserUserGet() throws RestClientException {
        return getCurrentUserUserGetWithHttpInfo().getBody();
    }

    /**
     * Get Current User
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> getCurrentUserUserGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<String> localReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/user/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Current User
     * 
     * <p><b>200</b> - Successful Response
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String getCurrentUserUserGet_0() throws RestClientException {
        return getCurrentUserUserGet_0WithHttpInfo().getBody();
    }

    /**
     * Get Current User
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> getCurrentUserUserGet_0WithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<String> localReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/user", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Embeddings
     * 
     * <p><b>200</b> - Successful Response
     * @return EmbeddingsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EmbeddingsResponse getEmbeddingsSdapiV1EmbeddingsGet() throws RestClientException {
        return getEmbeddingsSdapiV1EmbeddingsGetWithHttpInfo().getBody();
    }

    /**
     * Get Embeddings
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;EmbeddingsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EmbeddingsResponse> getEmbeddingsSdapiV1EmbeddingsGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<EmbeddingsResponse> localReturnType = new ParameterizedTypeReference<EmbeddingsResponse>() {};
        return apiClient.invokeAPI("/sdapi/v1/embeddings", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Face Restorers
     * 
     * <p><b>200</b> - Successful Response
     * @return List&lt;FaceRestorerItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<FaceRestorerItem> getFaceRestorersSdapiV1FaceRestorersGet() throws RestClientException {
        return getFaceRestorersSdapiV1FaceRestorersGetWithHttpInfo().getBody();
    }

    /**
     * Get Face Restorers
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;List&lt;FaceRestorerItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<FaceRestorerItem>> getFaceRestorersSdapiV1FaceRestorersGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<List<FaceRestorerItem>> localReturnType = new ParameterizedTypeReference<List<FaceRestorerItem>>() {};
        return apiClient.invokeAPI("/sdapi/v1/face-restorers", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Hypernetworks
     * 
     * <p><b>200</b> - Successful Response
     * @return List&lt;HypernetworkItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<HypernetworkItem> getHypernetworksSdapiV1HypernetworksGet() throws RestClientException {
        return getHypernetworksSdapiV1HypernetworksGetWithHttpInfo().getBody();
    }

    /**
     * Get Hypernetworks
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;List&lt;HypernetworkItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<HypernetworkItem>> getHypernetworksSdapiV1HypernetworksGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<List<HypernetworkItem>> localReturnType = new ParameterizedTypeReference<List<HypernetworkItem>>() {};
        return apiClient.invokeAPI("/sdapi/v1/hypernetworks", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Latent Upscale Modes
     * 
     * <p><b>200</b> - Successful Response
     * @return List&lt;LatentUpscalerModeItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<LatentUpscalerModeItem> getLatentUpscaleModesSdapiV1LatentUpscaleModesGet() throws RestClientException {
        return getLatentUpscaleModesSdapiV1LatentUpscaleModesGetWithHttpInfo().getBody();
    }

    /**
     * Get Latent Upscale Modes
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;List&lt;LatentUpscalerModeItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<LatentUpscalerModeItem>> getLatentUpscaleModesSdapiV1LatentUpscaleModesGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<List<LatentUpscalerModeItem>> localReturnType = new ParameterizedTypeReference<List<LatentUpscalerModeItem>>() {};
        return apiClient.invokeAPI("/sdapi/v1/latent-upscale-modes", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Loras
     * 
     * <p><b>200</b> - Successful Response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object getLorasSdapiV1LorasGet() throws RestClientException {
        return getLorasSdapiV1LorasGetWithHttpInfo().getBody();
    }

    /**
     * Get Loras
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> getLorasSdapiV1LorasGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/sdapi/v1/loras", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Memory
     * 
     * <p><b>200</b> - Successful Response
     * @return MemoryResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MemoryResponse getMemorySdapiV1MemoryGet() throws RestClientException {
        return getMemorySdapiV1MemoryGetWithHttpInfo().getBody();
    }

    /**
     * Get Memory
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;MemoryResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MemoryResponse> getMemorySdapiV1MemoryGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<MemoryResponse> localReturnType = new ParameterizedTypeReference<MemoryResponse>() {};
        return apiClient.invokeAPI("/sdapi/v1/memory", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Metadata
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param page  (optional, default to )
     * @param item  (optional, default to )
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object getMetadataSdExtraNetworksMetadataGet(String page, String item) throws RestClientException {
        return getMetadataSdExtraNetworksMetadataGetWithHttpInfo(page, item).getBody();
    }

    /**
     * Get Metadata
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param page  (optional, default to )
     * @param item  (optional, default to )
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> getMetadataSdExtraNetworksMetadataGetWithHttpInfo(String page, String item) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "item", item));


        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/sd_extra_networks/metadata", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Prompt Styles
     * 
     * <p><b>200</b> - Successful Response
     * @return List&lt;PromptStyleItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PromptStyleItem> getPromptStylesSdapiV1PromptStylesGet() throws RestClientException {
        return getPromptStylesSdapiV1PromptStylesGetWithHttpInfo().getBody();
    }

    /**
     * Get Prompt Styles
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;List&lt;PromptStyleItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PromptStyleItem>> getPromptStylesSdapiV1PromptStylesGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<List<PromptStyleItem>> localReturnType = new ParameterizedTypeReference<List<PromptStyleItem>>() {};
        return apiClient.invokeAPI("/sdapi/v1/prompt-styles", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Queue Status
     * 
     * <p><b>200</b> - Successful Response
     * @return Estimation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Estimation getQueueStatusQueueStatusGet() throws RestClientException {
        return getQueueStatusQueueStatusGetWithHttpInfo().getBody();
    }

    /**
     * Get Queue Status
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Estimation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Estimation> getQueueStatusQueueStatusGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Estimation> localReturnType = new ParameterizedTypeReference<Estimation>() {};
        return apiClient.invokeAPI("/queue/status", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Realesrgan Models
     * 
     * <p><b>200</b> - Successful Response
     * @return List&lt;RealesrganItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<RealesrganItem> getRealesrganModelsSdapiV1RealesrganModelsGet() throws RestClientException {
        return getRealesrganModelsSdapiV1RealesrganModelsGetWithHttpInfo().getBody();
    }

    /**
     * Get Realesrgan Models
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;List&lt;RealesrganItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<RealesrganItem>> getRealesrganModelsSdapiV1RealesrganModelsGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<List<RealesrganItem>> localReturnType = new ParameterizedTypeReference<List<RealesrganItem>>() {};
        return apiClient.invokeAPI("/sdapi/v1/realesrgan-models", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Samplers
     * 
     * <p><b>200</b> - Successful Response
     * @return List&lt;SamplerItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SamplerItem> getSamplersSdapiV1SamplersGet() throws RestClientException {
        return getSamplersSdapiV1SamplersGetWithHttpInfo().getBody();
    }

    /**
     * Get Samplers
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;List&lt;SamplerItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SamplerItem>> getSamplersSdapiV1SamplersGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<List<SamplerItem>> localReturnType = new ParameterizedTypeReference<List<SamplerItem>>() {};
        return apiClient.invokeAPI("/sdapi/v1/samplers", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Script Info
     * 
     * <p><b>200</b> - Successful Response
     * @return List&lt;ScriptInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ScriptInfo> getScriptInfoSdapiV1ScriptInfoGet() throws RestClientException {
        return getScriptInfoSdapiV1ScriptInfoGetWithHttpInfo().getBody();
    }

    /**
     * Get Script Info
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;List&lt;ScriptInfo&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ScriptInfo>> getScriptInfoSdapiV1ScriptInfoGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<List<ScriptInfo>> localReturnType = new ParameterizedTypeReference<List<ScriptInfo>>() {};
        return apiClient.invokeAPI("/sdapi/v1/script-info", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Scripts List
     * 
     * <p><b>200</b> - Successful Response
     * @return ScriptsList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ScriptsList getScriptsListSdapiV1ScriptsGet() throws RestClientException {
        return getScriptsListSdapiV1ScriptsGetWithHttpInfo().getBody();
    }

    /**
     * Get Scripts List
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;ScriptsList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ScriptsList> getScriptsListSdapiV1ScriptsGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<ScriptsList> localReturnType = new ParameterizedTypeReference<ScriptsList>() {};
        return apiClient.invokeAPI("/sdapi/v1/scripts", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Sd Models
     * 
     * <p><b>200</b> - Successful Response
     * @return List&lt;SDModelItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SDModelItem> getSdModelsSdapiV1SdModelsGet() throws RestClientException {
        return getSdModelsSdapiV1SdModelsGetWithHttpInfo().getBody();
    }

    /**
     * Get Sd Models
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;List&lt;SDModelItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SDModelItem>> getSdModelsSdapiV1SdModelsGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<List<SDModelItem>> localReturnType = new ParameterizedTypeReference<List<SDModelItem>>() {};
        return apiClient.invokeAPI("/sdapi/v1/sd-models", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Sd Vaes
     * 
     * <p><b>200</b> - Successful Response
     * @return List&lt;SDVaeItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SDVaeItem> getSdVaesSdapiV1SdVaeGet() throws RestClientException {
        return getSdVaesSdapiV1SdVaeGetWithHttpInfo().getBody();
    }

    /**
     * Get Sd Vaes
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;List&lt;SDVaeItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SDVaeItem>> getSdVaesSdapiV1SdVaeGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<List<SDVaeItem>> localReturnType = new ParameterizedTypeReference<List<SDVaeItem>>() {};
        return apiClient.invokeAPI("/sdapi/v1/sd-vae", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Single Card
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param page  (optional, default to )
     * @param tabname  (optional, default to )
     * @param name  (optional, default to )
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object getSingleCardSdExtraNetworksGetSingleCardGet(String page, String tabname, String name) throws RestClientException {
        return getSingleCardSdExtraNetworksGetSingleCardGetWithHttpInfo(page, tabname, name).getBody();
    }

    /**
     * Get Single Card
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param page  (optional, default to )
     * @param tabname  (optional, default to )
     * @param name  (optional, default to )
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> getSingleCardSdExtraNetworksGetSingleCardGetWithHttpInfo(String page, String tabname, String name) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "tabname", tabname));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));


        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/sd_extra_networks/get-single-card", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Token
     * 
     * <p><b>200</b> - Successful Response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object getTokenTokenGet() throws RestClientException {
        return getTokenTokenGetWithHttpInfo().getBody();
    }

    /**
     * Get Token
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> getTokenTokenGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/token/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Token
     * 
     * <p><b>200</b> - Successful Response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object getTokenTokenGet_0() throws RestClientException {
        return getTokenTokenGet_0WithHttpInfo().getBody();
    }

    /**
     * Get Token
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> getTokenTokenGet_0WithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/token", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Upscalers
     * 
     * <p><b>200</b> - Successful Response
     * @return List&lt;UpscalerItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<UpscalerItem> getUpscalersSdapiV1UpscalersGet() throws RestClientException {
        return getUpscalersSdapiV1UpscalersGetWithHttpInfo().getBody();
    }

    /**
     * Get Upscalers
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;List&lt;UpscalerItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<UpscalerItem>> getUpscalersSdapiV1UpscalersGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<List<UpscalerItem>> localReturnType = new ParameterizedTypeReference<List<UpscalerItem>>() {};
        return apiClient.invokeAPI("/sdapi/v1/upscalers", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Img2Imgapi
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param stableDiffusionProcessingImg2Img  (required)
     * @return ImageToImageResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ImageToImageResponse img2imgapiSdapiV1Img2imgPost(StableDiffusionProcessingImg2Img stableDiffusionProcessingImg2Img) throws RestClientException {
        return img2imgapiSdapiV1Img2imgPostWithHttpInfo(stableDiffusionProcessingImg2Img).getBody();
    }

    /**
     * Img2Imgapi
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param stableDiffusionProcessingImg2Img  (required)
     * @return ResponseEntity&lt;ImageToImageResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ImageToImageResponse> img2imgapiSdapiV1Img2imgPostWithHttpInfo(StableDiffusionProcessingImg2Img stableDiffusionProcessingImg2Img) throws RestClientException {
        Object localVarPostBody = stableDiffusionProcessingImg2Img;
        
        // verify the required parameter 'stableDiffusionProcessingImg2Img' is set
        if (stableDiffusionProcessingImg2Img == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stableDiffusionProcessingImg2Img' when calling img2imgapiSdapiV1Img2imgPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<ImageToImageResponse> localReturnType = new ParameterizedTypeReference<ImageToImageResponse>() {};
        return apiClient.invokeAPI("/sdapi/v1/img2img", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Interrogateapi
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param interrogateRequest  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object interrogateapiSdapiV1InterrogatePost(InterrogateRequest interrogateRequest) throws RestClientException {
        return interrogateapiSdapiV1InterrogatePostWithHttpInfo(interrogateRequest).getBody();
    }

    /**
     * Interrogateapi
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param interrogateRequest  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> interrogateapiSdapiV1InterrogatePostWithHttpInfo(InterrogateRequest interrogateRequest) throws RestClientException {
        Object localVarPostBody = interrogateRequest;
        
        // verify the required parameter 'interrogateRequest' is set
        if (interrogateRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'interrogateRequest' when calling interrogateapiSdapiV1InterrogatePost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/sdapi/v1/interrogate", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Interruptapi
     * 
     * <p><b>200</b> - Successful Response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object interruptapiSdapiV1InterruptPost() throws RestClientException {
        return interruptapiSdapiV1InterruptPostWithHttpInfo().getBody();
    }

    /**
     * Interruptapi
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> interruptapiSdapiV1InterruptPostWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/sdapi/v1/interrupt", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * &lt;Lambda&gt;
     * 
     * <p><b>200</b> - Successful Response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object lambdaInternalPingGet() throws RestClientException {
        return lambdaInternalPingGetWithHttpInfo().getBody();
    }

    /**
     * &lt;Lambda&gt;
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> lambdaInternalPingGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/internal/ping", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * &lt;Lambda&gt;
     * 
     * <p><b>200</b> - Successful Response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object lambdaInternalProfileStartupGet() throws RestClientException {
        return lambdaInternalProfileStartupGetWithHttpInfo().getBody();
    }

    /**
     * &lt;Lambda&gt;
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> lambdaInternalProfileStartupGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/internal/profile-startup", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * &lt;Lambda&gt;
     * 
     * <p><b>200</b> - Successful Response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object lambdaInternalSysinfoDownloadGet() throws RestClientException {
        return lambdaInternalSysinfoDownloadGetWithHttpInfo().getBody();
    }

    /**
     * &lt;Lambda&gt;
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> lambdaInternalSysinfoDownloadGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/internal/sysinfo-download", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Login Check
     * 
     * <p><b>200</b> - Successful Response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object loginCheckLoginCheckGet() throws RestClientException {
        return loginCheckLoginCheckGetWithHttpInfo().getBody();
    }

    /**
     * Login Check
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> loginCheckLoginCheckGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/login_check/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Login Check
     * 
     * <p><b>200</b> - Successful Response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object loginCheckLoginCheckGet_0() throws RestClientException {
        return loginCheckLoginCheckGet_0WithHttpInfo().getBody();
    }

    /**
     * Login Check
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> loginCheckLoginCheckGet_0WithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/login_check", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Login
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param username  (required)
     * @param password  (required)
     * @param grantType  (optional)
     * @param scope  (optional, default to )
     * @param clientId  (optional)
     * @param clientSecret  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object loginLoginPost(String username, String password, String grantType, String scope, String clientId, String clientSecret) throws RestClientException {
        return loginLoginPostWithHttpInfo(username, password, grantType, scope, clientId, clientSecret).getBody();
    }

    /**
     * Login
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param username  (required)
     * @param password  (required)
     * @param grantType  (optional)
     * @param scope  (optional, default to )
     * @param clientId  (optional)
     * @param clientSecret  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> loginLoginPostWithHttpInfo(String username, String password, String grantType, String scope, String clientId, String clientSecret) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling loginLoginPost");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'password' when calling loginLoginPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (grantType != null)
            localVarFormParams.add("grant_type", grantType);
        if (username != null)
            localVarFormParams.add("username", username);
        if (password != null)
            localVarFormParams.add("password", password);
        if (scope != null)
            localVarFormParams.add("scope", scope);
        if (clientId != null)
            localVarFormParams.add("client_id", clientId);
        if (clientSecret != null)
            localVarFormParams.add("client_secret", clientSecret);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/login/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Login
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param username  (required)
     * @param password  (required)
     * @param grantType  (optional)
     * @param scope  (optional, default to )
     * @param clientId  (optional)
     * @param clientSecret  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object loginLoginPost_0(String username, String password, String grantType, String scope, String clientId, String clientSecret) throws RestClientException {
        return loginLoginPost_0WithHttpInfo(username, password, grantType, scope, clientId, clientSecret).getBody();
    }

    /**
     * Login
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param username  (required)
     * @param password  (required)
     * @param grantType  (optional)
     * @param scope  (optional, default to )
     * @param clientId  (optional)
     * @param clientSecret  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> loginLoginPost_0WithHttpInfo(String username, String password, String grantType, String scope, String clientId, String clientSecret) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling loginLoginPost_0");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'password' when calling loginLoginPost_0");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (grantType != null)
            localVarFormParams.add("grant_type", grantType);
        if (username != null)
            localVarFormParams.add("username", username);
        if (password != null)
            localVarFormParams.add("password", password);
        if (scope != null)
            localVarFormParams.add("scope", scope);
        if (clientId != null)
            localVarFormParams.add("client_id", clientId);
        if (clientSecret != null)
            localVarFormParams.add("client_secret", clientSecret);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/login", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Main
     * 
     * <p><b>200</b> - Successful Response
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String mainGet() throws RestClientException {
        return mainGetWithHttpInfo().getBody();
    }

    /**
     * Main
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> mainGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/html"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<String> localReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Main
     * 
     * <p><b>200</b> - Successful Response
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String mainHead() throws RestClientException {
        return mainHeadWithHttpInfo().getBody();
    }

    /**
     * Main
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> mainHeadWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/html"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<String> localReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/", HttpMethod.HEAD, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Pnginfoapi
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param pnGInfoRequest  (required)
     * @return PNGInfoResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PNGInfoResponse pnginfoapiSdapiV1PngInfoPost(PNGInfoRequest pnGInfoRequest) throws RestClientException {
        return pnginfoapiSdapiV1PngInfoPostWithHttpInfo(pnGInfoRequest).getBody();
    }

    /**
     * Pnginfoapi
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param pnGInfoRequest  (required)
     * @return ResponseEntity&lt;PNGInfoResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PNGInfoResponse> pnginfoapiSdapiV1PngInfoPostWithHttpInfo(PNGInfoRequest pnGInfoRequest) throws RestClientException {
        Object localVarPostBody = pnGInfoRequest;
        
        // verify the required parameter 'pnGInfoRequest' is set
        if (pnGInfoRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pnGInfoRequest' when calling pnginfoapiSdapiV1PngInfoPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<PNGInfoResponse> localReturnType = new ParameterizedTypeReference<PNGInfoResponse>() {};
        return apiClient.invokeAPI("/sdapi/v1/png-info", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Predict
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param apiName  (required)
     * @param predictBody  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object predictApiApiNamePost(String apiName, PredictBody predictBody) throws RestClientException {
        return predictApiApiNamePostWithHttpInfo(apiName, predictBody).getBody();
    }

    /**
     * Predict
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param apiName  (required)
     * @param predictBody  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> predictApiApiNamePostWithHttpInfo(String apiName, PredictBody predictBody) throws RestClientException {
        Object localVarPostBody = predictBody;
        
        // verify the required parameter 'apiName' is set
        if (apiName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiName' when calling predictApiApiNamePost");
        }
        
        // verify the required parameter 'predictBody' is set
        if (predictBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'predictBody' when calling predictApiApiNamePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("api_name", apiName);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/api/{api_name}/", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Predict
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param apiName  (required)
     * @param predictBody  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object predictApiApiNamePost_0(String apiName, PredictBody predictBody) throws RestClientException {
        return predictApiApiNamePost_0WithHttpInfo(apiName, predictBody).getBody();
    }

    /**
     * Predict
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param apiName  (required)
     * @param predictBody  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> predictApiApiNamePost_0WithHttpInfo(String apiName, PredictBody predictBody) throws RestClientException {
        Object localVarPostBody = predictBody;
        
        // verify the required parameter 'apiName' is set
        if (apiName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiName' when calling predictApiApiNamePost_0");
        }
        
        // verify the required parameter 'predictBody' is set
        if (predictBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'predictBody' when calling predictApiApiNamePost_0");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("api_name", apiName);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/api/{api_name}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Predict
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param apiName  (required)
     * @param predictBody  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object predictRunApiNamePost(String apiName, PredictBody predictBody) throws RestClientException {
        return predictRunApiNamePostWithHttpInfo(apiName, predictBody).getBody();
    }

    /**
     * Predict
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param apiName  (required)
     * @param predictBody  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> predictRunApiNamePostWithHttpInfo(String apiName, PredictBody predictBody) throws RestClientException {
        Object localVarPostBody = predictBody;
        
        // verify the required parameter 'apiName' is set
        if (apiName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiName' when calling predictRunApiNamePost");
        }
        
        // verify the required parameter 'predictBody' is set
        if (predictBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'predictBody' when calling predictRunApiNamePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("api_name", apiName);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/run/{api_name}/", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Predict
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param apiName  (required)
     * @param predictBody  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object predictRunApiNamePost_0(String apiName, PredictBody predictBody) throws RestClientException {
        return predictRunApiNamePost_0WithHttpInfo(apiName, predictBody).getBody();
    }

    /**
     * Predict
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param apiName  (required)
     * @param predictBody  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> predictRunApiNamePost_0WithHttpInfo(String apiName, PredictBody predictBody) throws RestClientException {
        Object localVarPostBody = predictBody;
        
        // verify the required parameter 'apiName' is set
        if (apiName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiName' when calling predictRunApiNamePost_0");
        }
        
        // verify the required parameter 'predictBody' is set
        if (predictBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'predictBody' when calling predictRunApiNamePost_0");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("api_name", apiName);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/run/{api_name}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Preprocess
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param body  (required)
     * @return PreprocessResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PreprocessResponse preprocessSdapiV1PreprocessPost(Object body) throws RestClientException {
        return preprocessSdapiV1PreprocessPostWithHttpInfo(body).getBody();
    }

    /**
     * Preprocess
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param body  (required)
     * @return ResponseEntity&lt;PreprocessResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PreprocessResponse> preprocessSdapiV1PreprocessPostWithHttpInfo(Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling preprocessSdapiV1PreprocessPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<PreprocessResponse> localReturnType = new ParameterizedTypeReference<PreprocessResponse>() {};
        return apiClient.invokeAPI("/sdapi/v1/preprocess", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Progressapi
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param progressRequest  (required)
     * @return ModulesProgressProgressResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModulesProgressProgressResponse progressapiInternalProgressPost(ProgressRequest progressRequest) throws RestClientException {
        return progressapiInternalProgressPostWithHttpInfo(progressRequest).getBody();
    }

    /**
     * Progressapi
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param progressRequest  (required)
     * @return ResponseEntity&lt;ModulesProgressProgressResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModulesProgressProgressResponse> progressapiInternalProgressPostWithHttpInfo(ProgressRequest progressRequest) throws RestClientException {
        Object localVarPostBody = progressRequest;
        
        // verify the required parameter 'progressRequest' is set
        if (progressRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'progressRequest' when calling progressapiInternalProgressPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ModulesProgressProgressResponse> localReturnType = new ParameterizedTypeReference<ModulesProgressProgressResponse>() {};
        return apiClient.invokeAPI("/internal/progress", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Progressapi
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param skipCurrentImage  (optional, default to false)
     * @return ModulesApiModelsProgressResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModulesApiModelsProgressResponse progressapiSdapiV1ProgressGet(Boolean skipCurrentImage) throws RestClientException {
        return progressapiSdapiV1ProgressGetWithHttpInfo(skipCurrentImage).getBody();
    }

    /**
     * Progressapi
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param skipCurrentImage  (optional, default to false)
     * @return ResponseEntity&lt;ModulesApiModelsProgressResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModulesApiModelsProgressResponse> progressapiSdapiV1ProgressGetWithHttpInfo(Boolean skipCurrentImage) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "skip_current_image", skipCurrentImage));


        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<ModulesApiModelsProgressResponse> localReturnType = new ParameterizedTypeReference<ModulesApiModelsProgressResponse>() {};
        return apiClient.invokeAPI("/sdapi/v1/progress", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Quicksettings Hint
     * 
     * <p><b>200</b> - Successful Response
     * @return List&lt;QuicksettingsHint&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<QuicksettingsHint> quicksettingsHintInternalQuicksettingsHintGet() throws RestClientException {
        return quicksettingsHintInternalQuicksettingsHintGetWithHttpInfo().getBody();
    }

    /**
     * Quicksettings Hint
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;List&lt;QuicksettingsHint&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<QuicksettingsHint>> quicksettingsHintInternalQuicksettingsHintGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<QuicksettingsHint>> localReturnType = new ParameterizedTypeReference<List<QuicksettingsHint>>() {};
        return apiClient.invokeAPI("/internal/quicksettings-hint", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Refresh Checkpoints
     * 
     * <p><b>200</b> - Successful Response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object refreshCheckpointsSdapiV1RefreshCheckpointsPost() throws RestClientException {
        return refreshCheckpointsSdapiV1RefreshCheckpointsPostWithHttpInfo().getBody();
    }

    /**
     * Refresh Checkpoints
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> refreshCheckpointsSdapiV1RefreshCheckpointsPostWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/sdapi/v1/refresh-checkpoints", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Refresh Loras
     * 
     * <p><b>200</b> - Successful Response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object refreshLorasSdapiV1RefreshLorasPost() throws RestClientException {
        return refreshLorasSdapiV1RefreshLorasPostWithHttpInfo().getBody();
    }

    /**
     * Refresh Loras
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> refreshLorasSdapiV1RefreshLorasPostWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/sdapi/v1/refresh-loras", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Refresh Vae
     * 
     * <p><b>200</b> - Successful Response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object refreshVaeSdapiV1RefreshVaePost() throws RestClientException {
        return refreshVaeSdapiV1RefreshVaePostWithHttpInfo().getBody();
    }

    /**
     * Refresh Vae
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> refreshVaeSdapiV1RefreshVaePostWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/sdapi/v1/refresh-vae", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Reloadapi
     * 
     * <p><b>200</b> - Successful Response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object reloadapiSdapiV1ReloadCheckpointPost() throws RestClientException {
        return reloadapiSdapiV1ReloadCheckpointPostWithHttpInfo().getBody();
    }

    /**
     * Reloadapi
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> reloadapiSdapiV1ReloadCheckpointPostWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/sdapi/v1/reload-checkpoint", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Reset Iterator
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param resetBody  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object resetIteratorResetPost(ResetBody resetBody) throws RestClientException {
        return resetIteratorResetPostWithHttpInfo(resetBody).getBody();
    }

    /**
     * Reset Iterator
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param resetBody  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> resetIteratorResetPostWithHttpInfo(ResetBody resetBody) throws RestClientException {
        Object localVarPostBody = resetBody;
        
        // verify the required parameter 'resetBody' is set
        if (resetBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resetBody' when calling resetIteratorResetPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/reset", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Reset Iterator
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param resetBody  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object resetIteratorResetPost_0(ResetBody resetBody) throws RestClientException {
        return resetIteratorResetPost_0WithHttpInfo(resetBody).getBody();
    }

    /**
     * Reset Iterator
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param resetBody  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> resetIteratorResetPost_0WithHttpInfo(ResetBody resetBody) throws RestClientException {
        Object localVarPostBody = resetBody;
        
        // verify the required parameter 'resetBody' is set
        if (resetBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resetBody' when calling resetIteratorResetPost_0");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/reset/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Reverse Proxy
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param urlPath  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object reverseProxyProxyUrlPathGet(String urlPath) throws RestClientException {
        return reverseProxyProxyUrlPathGetWithHttpInfo(urlPath).getBody();
    }

    /**
     * Reverse Proxy
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param urlPath  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> reverseProxyProxyUrlPathGetWithHttpInfo(String urlPath) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'urlPath' is set
        if (urlPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'urlPath' when calling reverseProxyProxyUrlPathGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("url_path", urlPath);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/proxy={url_path}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Reverse Proxy
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param urlPath  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object reverseProxyProxyUrlPathHead(String urlPath) throws RestClientException {
        return reverseProxyProxyUrlPathHeadWithHttpInfo(urlPath).getBody();
    }

    /**
     * Reverse Proxy
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param urlPath  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> reverseProxyProxyUrlPathHeadWithHttpInfo(String urlPath) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'urlPath' is set
        if (urlPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'urlPath' when calling reverseProxyProxyUrlPathHead");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("url_path", urlPath);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/proxy={url_path}", HttpMethod.HEAD, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Robots Txt
     * 
     * <p><b>200</b> - Successful Response
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String robotsTxtRobotsTxtGet() throws RestClientException {
        return robotsTxtRobotsTxtGetWithHttpInfo().getBody();
    }

    /**
     * Robots Txt
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> robotsTxtRobotsTxtGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<String> localReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/robots.txt", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Set Config
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param body  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object setConfigSdapiV1OptionsPost(Object body) throws RestClientException {
        return setConfigSdapiV1OptionsPostWithHttpInfo(body).getBody();
    }

    /**
     * Set Config
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param body  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> setConfigSdapiV1OptionsPostWithHttpInfo(Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling setConfigSdapiV1OptionsPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/sdapi/v1/options", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Skip
     * 
     * <p><b>200</b> - Successful Response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object skipSdapiV1SkipPost() throws RestClientException {
        return skipSdapiV1SkipPostWithHttpInfo().getBody();
    }

    /**
     * Skip
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> skipSdapiV1SkipPostWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/sdapi/v1/skip", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Startup Events
     * 
     * <p><b>200</b> - Successful Response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object startupEventsStartupEventsGet() throws RestClientException {
        return startupEventsStartupEventsGetWithHttpInfo().getBody();
    }

    /**
     * Startup Events
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> startupEventsStartupEventsGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/startup-events", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Static Resource
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param path  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object staticResourceStaticPathGet(String path) throws RestClientException {
        return staticResourceStaticPathGetWithHttpInfo(path).getBody();
    }

    /**
     * Static Resource
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param path  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> staticResourceStaticPathGetWithHttpInfo(String path) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'path' when calling staticResourceStaticPathGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("path", path);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/static/{path}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Stream
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param sessionHash  (required)
     * @param run  (required)
     * @param componentId  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object streamStreamSessionHashRunComponentIdGet(String sessionHash, Integer run, Integer componentId) throws RestClientException {
        return streamStreamSessionHashRunComponentIdGetWithHttpInfo(sessionHash, run, componentId).getBody();
    }

    /**
     * Stream
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param sessionHash  (required)
     * @param run  (required)
     * @param componentId  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> streamStreamSessionHashRunComponentIdGetWithHttpInfo(String sessionHash, Integer run, Integer componentId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'sessionHash' is set
        if (sessionHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionHash' when calling streamStreamSessionHashRunComponentIdGet");
        }
        
        // verify the required parameter 'run' is set
        if (run == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'run' when calling streamStreamSessionHashRunComponentIdGet");
        }
        
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'componentId' when calling streamStreamSessionHashRunComponentIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("session_hash", sessionHash);
        uriVariables.put("run", run);
        uriVariables.put("component_id", componentId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/stream/{session_hash}/{run}/{component_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Text2Imgapi
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param stableDiffusionProcessingTxt2Img  (required)
     * @return TextToImageResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TextToImageResponse text2imgapiSdapiV1Txt2imgPost(StableDiffusionProcessingTxt2Img stableDiffusionProcessingTxt2Img) throws RestClientException {
        return text2imgapiSdapiV1Txt2imgPostWithHttpInfo(stableDiffusionProcessingTxt2Img).getBody();
    }

    /**
     * Text2Imgapi
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param stableDiffusionProcessingTxt2Img  (required)
     * @return ResponseEntity&lt;TextToImageResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TextToImageResponse> text2imgapiSdapiV1Txt2imgPostWithHttpInfo(StableDiffusionProcessingTxt2Img stableDiffusionProcessingTxt2Img) throws RestClientException {
        Object localVarPostBody = stableDiffusionProcessingTxt2Img;
        
        // verify the required parameter 'stableDiffusionProcessingTxt2Img' is set
        if (stableDiffusionProcessingTxt2Img == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stableDiffusionProcessingTxt2Img' when calling text2imgapiSdapiV1Txt2imgPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<TextToImageResponse> localReturnType = new ParameterizedTypeReference<TextToImageResponse>() {};
        return apiClient.invokeAPI("/sdapi/v1/txt2img", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Theme Css
     * 
     * <p><b>200</b> - Successful Response
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String themeCssThemeCssGet() throws RestClientException {
        return themeCssThemeCssGetWithHttpInfo().getBody();
    }

    /**
     * Theme Css
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> themeCssThemeCssGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<String> localReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/theme.css", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Train Embedding
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param body  (required)
     * @return TrainResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TrainResponse trainEmbeddingSdapiV1TrainEmbeddingPost(Object body) throws RestClientException {
        return trainEmbeddingSdapiV1TrainEmbeddingPostWithHttpInfo(body).getBody();
    }

    /**
     * Train Embedding
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param body  (required)
     * @return ResponseEntity&lt;TrainResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TrainResponse> trainEmbeddingSdapiV1TrainEmbeddingPostWithHttpInfo(Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling trainEmbeddingSdapiV1TrainEmbeddingPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<TrainResponse> localReturnType = new ParameterizedTypeReference<TrainResponse>() {};
        return apiClient.invokeAPI("/sdapi/v1/train/embedding", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Train Hypernetwork
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param body  (required)
     * @return TrainResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TrainResponse trainHypernetworkSdapiV1TrainHypernetworkPost(Object body) throws RestClientException {
        return trainHypernetworkSdapiV1TrainHypernetworkPostWithHttpInfo(body).getBody();
    }

    /**
     * Train Hypernetwork
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param body  (required)
     * @return ResponseEntity&lt;TrainResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TrainResponse> trainHypernetworkSdapiV1TrainHypernetworkPostWithHttpInfo(Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling trainHypernetworkSdapiV1TrainHypernetworkPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<TrainResponse> localReturnType = new ParameterizedTypeReference<TrainResponse>() {};
        return apiClient.invokeAPI("/sdapi/v1/train/hypernetwork", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Unloadapi
     * 
     * <p><b>200</b> - Successful Response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object unloadapiSdapiV1UnloadCheckpointPost() throws RestClientException {
        return unloadapiSdapiV1UnloadCheckpointPostWithHttpInfo().getBody();
    }

    /**
     * Unloadapi
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> unloadapiSdapiV1UnloadCheckpointPostWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/sdapi/v1/unload-checkpoint", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Upload File
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param files  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object uploadFileUploadPost(List<File> files) throws RestClientException {
        return uploadFileUploadPostWithHttpInfo(files).getBody();
    }

    /**
     * Upload File
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param files  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> uploadFileUploadPostWithHttpInfo(List<File> files) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'files' is set
        if (files == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'files' when calling uploadFileUploadPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (files != null)
            localVarFormParams.addAll("files", files.stream().map(FileSystemResource::new).collect(Collectors.toList()));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/upload", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
