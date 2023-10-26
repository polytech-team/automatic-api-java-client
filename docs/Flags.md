

# Flags


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**f** | **Boolean** | &#x3D;&#x3D;SUPPRESS&#x3D;&#x3D; |  [optional] |
|**updateAllExtensions** | **Boolean** | launch.py argument: download updates for all extensions when starting the program |  [optional] |
|**skipPythonVersionCheck** | **Boolean** | launch.py argument: do not check python version |  [optional] |
|**skipTorchCudaTest** | **Boolean** | launch.py argument: do not check if CUDA is able to work properly |  [optional] |
|**reinstallXformers** | **Boolean** | launch.py argument: install the appropriate version of xformers even if you have some version already installed |  [optional] |
|**reinstallTorch** | **Boolean** | launch.py argument: install the appropriate version of torch even if you have some version already installed |  [optional] |
|**updateCheck** | **Boolean** | launch.py argument: check for updates at startup |  [optional] |
|**testServer** | **Boolean** | launch.py argument: configure server for testing |  [optional] |
|**logStartup** | **Boolean** | launch.py argument: print a detailed log of what&#39;s happening at startup |  [optional] |
|**skipPrepareEnvironment** | **Boolean** | launch.py argument: skip all environment preparation |  [optional] |
|**skipInstall** | **Boolean** | launch.py argument: skip installation of packages |  [optional] |
|**dumpSysinfo** | **Boolean** | launch.py argument: dump limited sysinfo file (without information about extensions, options) to disk and quit |  [optional] |
|**loglevel** | **String** | log level; one of: CRITICAL, ERROR, WARNING, INFO, DEBUG |  [optional] |
|**doNotDownloadClip** | **Boolean** | do not download CLIP model even if it&#39;s not included in the checkpoint |  [optional] |
|**dataDir** | **String** | base path where all user data is stored |  [optional] |
|**config** | **String** | path to config which constructs model |  [optional] |
|**ckpt** | **String** | path to checkpoint of stable diffusion model; if specified, this checkpoint will be added to the list of checkpoints and loaded |  [optional] |
|**ckptDir** | **String** | Path to directory with stable diffusion checkpoints |  [optional] |
|**vaeDir** | **String** | Path to directory with VAE files |  [optional] |
|**gfpganDir** | **String** | GFPGAN directory |  [optional] |
|**gfpganModel** | **String** | GFPGAN model file name |  [optional] |
|**noHalf** | **Boolean** | do not switch the model to 16-bit floats |  [optional] |
|**noHalfVae** | **Boolean** | do not switch the VAE model to 16-bit floats |  [optional] |
|**noProgressbarHiding** | **Boolean** | do not hide progressbar in gradio UI (we hide it because it slows down ML if you have hardware acceleration in browser) |  [optional] |
|**maxBatchCount** | **Integer** | maximum batch count value for the UI |  [optional] |
|**embeddingsDir** | **String** | embeddings directory for textual inversion (default: embeddings) |  [optional] |
|**textualInversionTemplatesDir** | **String** | directory with textual inversion templates |  [optional] |
|**hypernetworkDir** | **String** | hypernetwork directory |  [optional] |
|**localizationsDir** | **String** | localizations directory |  [optional] |
|**allowCode** | **Boolean** | allow custom script execution from webui |  [optional] |
|**medvram** | **Boolean** | enable stable diffusion model optimizations for sacrificing a little speed for low VRM usage |  [optional] |
|**medvramSdxl** | **Boolean** | enable --medvram optimization just for SDXL models |  [optional] |
|**lowvram** | **Boolean** | enable stable diffusion model optimizations for sacrificing a lot of speed for very low VRM usage |  [optional] |
|**lowram** | **Boolean** | load stable diffusion checkpoint weights to VRAM instead of RAM |  [optional] |
|**alwaysBatchCondUncond** | **Boolean** | does not do anything |  [optional] |
|**unloadGfpgan** | **Boolean** | does not do anything. |  [optional] |
|**precision** | **String** | evaluate at this precision |  [optional] |
|**upcastSampling** | **Boolean** | upcast sampling. No effect with --no-half. Usually produces similar results to --no-half with better performance while using less memory. |  [optional] |
|**share** | **Boolean** | use share&#x3D;True for gradio and make the UI accessible through their site |  [optional] |
|**ngrok** | **String** | ngrok authtoken, alternative to gradio --share |  [optional] |
|**ngrokRegion** | **String** | does not do anything. |  [optional] |
|**ngrokOptions** | **Object** | The options to pass to ngrok in JSON format, e.g.: &#39;{\&quot;authtoken_from_env\&quot;:true, \&quot;basic_auth\&quot;:\&quot;user:password\&quot;, \&quot;oauth_provider\&quot;:\&quot;google\&quot;, \&quot;oauth_allow_emails\&quot;:\&quot;user@asdf.com\&quot;}&#39; |  [optional] |
|**enableInsecureExtensionAccess** | **Boolean** | enable extensions tab regardless of other options |  [optional] |
|**codeformerModelsPath** | **String** | Path to directory with codeformer model file(s). |  [optional] |
|**gfpganModelsPath** | **String** | Path to directory with GFPGAN model file(s). |  [optional] |
|**esrganModelsPath** | **String** | Path to directory with ESRGAN model file(s). |  [optional] |
|**bsrganModelsPath** | **String** | Path to directory with BSRGAN model file(s). |  [optional] |
|**realesrganModelsPath** | **String** | Path to directory with RealESRGAN model file(s). |  [optional] |
|**clipModelsPath** | **String** | Path to directory with CLIP model file(s). |  [optional] |
|**xformers** | **Boolean** | enable xformers for cross attention layers |  [optional] |
|**forceEnableXformers** | **Boolean** | enable xformers for cross attention layers regardless of whether the checking code thinks you can run it; do not make bug reports if this fails to work |  [optional] |
|**xformersFlashAttention** | **Boolean** | enable xformers with Flash Attention to improve reproducibility (supported for SD2.x or variant only) |  [optional] |
|**deepdanbooru** | **Boolean** | does not do anything |  [optional] |
|**optSplitAttention** | **Boolean** | prefer Doggettx&#39;s cross-attention layer optimization for automatic choice of optimization |  [optional] |
|**optSubQuadAttention** | **Boolean** | prefer memory efficient sub-quadratic cross-attention layer optimization for automatic choice of optimization |  [optional] |
|**subQuadQChunkSize** | **Integer** | query chunk size for the sub-quadratic cross-attention layer optimization to use |  [optional] |
|**subQuadKvChunkSize** | **String** | kv chunk size for the sub-quadratic cross-attention layer optimization to use |  [optional] |
|**subQuadChunkThreshold** | **String** | the percentage of VRAM threshold for the sub-quadratic cross-attention layer optimization to use chunking |  [optional] |
|**optSplitAttentionInvokeai** | **Boolean** | prefer InvokeAI&#39;s cross-attention layer optimization for automatic choice of optimization |  [optional] |
|**optSplitAttentionV1** | **Boolean** | prefer older version of split attention optimization for automatic choice of optimization |  [optional] |
|**optSdpAttention** | **Boolean** | prefer scaled dot product cross-attention layer optimization for automatic choice of optimization; requires PyTorch 2.* |  [optional] |
|**optSdpNoMemAttention** | **Boolean** | prefer scaled dot product cross-attention layer optimization without memory efficient attention for automatic choice of optimization, makes image generation deterministic; requires PyTorch 2.* |  [optional] |
|**disableOptSplitAttention** | **Boolean** | prefer no cross-attention layer optimization for automatic choice of optimization |  [optional] |
|**disableNanCheck** | **Boolean** | do not check if produced images/latent spaces have nans; useful for running without a checkpoint in CI |  [optional] |
|**useCpu** | **List&lt;Object&gt;** | use CPU as torch device for specified modules |  [optional] |
|**disableModelLoadingRamOptimization** | **Boolean** | disable an optimization that reduces RAM use when loading a model |  [optional] |
|**listen** | **Boolean** | launch gradio with 0.0.0.0 as server name, allowing to respond to network requests |  [optional] |
|**port** | **String** | launch gradio with given server port, you need root/admin rights for ports &lt; 1024, defaults to 7860 if available |  [optional] |
|**showNegativePrompt** | **Boolean** | does not do anything |  [optional] |
|**uiConfigFile** | **String** | filename to use for ui configuration |  [optional] |
|**hideUiDirConfig** | **Boolean** | hide directory configuration from webui |  [optional] |
|**freezeSettings** | **Boolean** | disable editing settings |  [optional] |
|**uiSettingsFile** | **String** | filename to use for ui settings |  [optional] |
|**gradioDebug** | **Boolean** | launch gradio with --debug option |  [optional] |
|**gradioAuth** | **String** | set gradio authentication like \&quot;username:password\&quot;; or comma-delimit multiple like \&quot;u1:p1,u2:p2,u3:p3\&quot; |  [optional] |
|**gradioAuthPath** | **String** | set gradio authentication file path ex. \&quot;/path/to/auth/file\&quot; same auth format as --gradio-auth |  [optional] |
|**gradioImg2imgTool** | **String** | does not do anything |  [optional] |
|**gradioInpaintTool** | **String** | does not do anything |  [optional] |
|**gradioAllowedPath** | **List&lt;Object&gt;** | add path to gradio&#39;s allowed_paths, make it possible to serve files from it |  [optional] |
|**optChannelslast** | **Boolean** | change memory type for stable diffusion to channels last |  [optional] |
|**stylesFile** | **String** | filename to use for styles |  [optional] |
|**autolaunch** | **Boolean** | open the webui URL in the system&#39;s default browser upon launch |  [optional] |
|**theme** | **String** | launches the UI with light or dark theme |  [optional] |
|**useTextboxSeed** | **Boolean** | use textbox for seeds in UI (no up/down, but possible to input long seeds) |  [optional] |
|**disableConsoleProgressbars** | **Boolean** | do not output progressbars to console |  [optional] |
|**enableConsolePrompts** | **Boolean** | print prompts to console when generating with txt2img and img2img |  [optional] |
|**vaePath** | **String** | Checkpoint to use as VAE; setting this argument disables all settings related to VAE |  [optional] |
|**disableSafeUnpickle** | **Boolean** | disable checking pytorch models for malicious code |  [optional] |
|**api** | **Boolean** | use api&#x3D;True to launch the API together with the webui (use --nowebui instead for only the API) |  [optional] |
|**apiAuth** | **String** | Set authentication for API like \&quot;username:password\&quot;; or comma-delimit multiple like \&quot;u1:p1,u2:p2,u3:p3\&quot; |  [optional] |
|**apiLog** | **Boolean** | use api-log&#x3D;True to enable logging of all API requests |  [optional] |
|**nowebui** | **Boolean** | use api&#x3D;True to launch the API instead of the webui |  [optional] |
|**uiDebugMode** | **Boolean** | Don&#39;t load model to quickly launch UI |  [optional] |
|**deviceId** | **String** | Select the default CUDA device to use (export CUDA_VISIBLE_DEVICES&#x3D;0,1,etc might be needed before) |  [optional] |
|**administrator** | **Boolean** | Administrator rights |  [optional] |
|**corsAllowOrigins** | **String** | Allowed CORS origin(s) in the form of a comma-separated list (no spaces) |  [optional] |
|**corsAllowOriginsRegex** | **String** | Allowed CORS origin(s) in the form of a single regular expression |  [optional] |
|**tlsKeyfile** | **String** | Partially enables TLS, requires --tls-certfile to fully function |  [optional] |
|**tlsCertfile** | **String** | Partially enables TLS, requires --tls-keyfile to fully function |  [optional] |
|**disableTlsVerify** | **String** | When passed, enables the use of self-signed certificates. |  [optional] |
|**serverName** | **String** | Sets hostname of server |  [optional] |
|**gradioQueue** | **Boolean** | does not do anything |  [optional] |
|**noGradioQueue** | **Boolean** | Disables gradio queue; causes the webpage to use http requests instead of websockets; was the defaul in earlier versions |  [optional] |
|**skipVersionCheck** | **Boolean** | Do not check versions of torch and xformers |  [optional] |
|**noHashing** | **Boolean** | disable sha256 hashing of checkpoints to help loading performance |  [optional] |
|**noDownloadSdModel** | **Boolean** | don&#39;t download SD1.5 model even if no model is found in --ckpt-dir |  [optional] |
|**subpath** | **String** | customize the subpath for gradio, use with reverse proxy |  [optional] |
|**addStopRoute** | **Boolean** | add /_stop route to stop server |  [optional] |
|**apiServerStop** | **Boolean** | enable server stop/restart/kill via api |  [optional] |
|**timeoutKeepAlive** | **Integer** | set timeout_keep_alive for uvicorn |  [optional] |
|**disableAllExtensions** | **Boolean** | prevent all extensions from running regardless of any other settings |  [optional] |
|**disableExtraExtensions** | **Boolean** |  prevent all extensions except built-in from running regardless of any other settings |  [optional] |
|**ldsrModelsPath** | **String** | Path to directory with LDSR model file(s). |  [optional] |
|**loraDir** | **String** | Path to directory with Lora networks. |  [optional] |
|**lycoDirBackcompat** | **String** | Path to directory with LyCORIS networks (for backawards compatibility; can also use --lyco-dir). |  [optional] |
|**scunetModelsPath** | **String** | Path to directory with ScuNET model file(s). |  [optional] |
|**swinirModelsPath** | **String** | Path to directory with SwinIR model file(s). |  [optional] |



