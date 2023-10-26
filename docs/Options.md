

# Options


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**samplesSave** | **Boolean** | Always save all generated images |  [optional] |
|**samplesFormat** | **String** | File format for images |  [optional] |
|**samplesFilenamePattern** | **Object** | Images filename pattern |  [optional] |
|**saveImagesAddNumber** | **Boolean** | Add number to filename when saving |  [optional] |
|**gridSave** | **Boolean** | Always save all generated image grids |  [optional] |
|**gridFormat** | **String** | File format for grids |  [optional] |
|**gridExtendedFilename** | **Object** | Add extended info (seed, prompt) to filename when saving grid |  [optional] |
|**gridOnlyIfMultiple** | **Boolean** | Do not save grids consisting of one picture |  [optional] |
|**gridPreventEmptySpots** | **Object** | Prevent empty spots in grid (when set to autodetect) |  [optional] |
|**gridZipFilenamePattern** | **Object** | Archive filename pattern |  [optional] |
|**nRows** | **BigDecimal** | Grid row count; use -1 for autodetect and 0 for it to be same as batch size |  [optional] |
|**font** | **Object** | Font for image grids that have text |  [optional] |
|**gridTextActiveColor** | **String** | Text color for image grids |  [optional] |
|**gridTextInactiveColor** | **String** | Inactive text color for image grids |  [optional] |
|**gridBackgroundColor** | **String** | Background color for image grids |  [optional] |
|**enablePnginfo** | **Boolean** | Save text information about generation parameters as chunks to png files |  [optional] |
|**saveTxt** | **Object** | Create a text file next to every image with generation parameters. |  [optional] |
|**saveImagesBeforeFaceRestoration** | **Object** | Save a copy of image before doing face restoration. |  [optional] |
|**saveImagesBeforeHighresFix** | **Object** | Save a copy of image before applying highres fix. |  [optional] |
|**saveImagesBeforeColorCorrection** | **Object** | Save a copy of image before applying color correction to img2img results |  [optional] |
|**saveMask** | **Object** | For inpainting, save a copy of the greyscale mask |  [optional] |
|**saveMaskComposite** | **Object** | For inpainting, save a masked composite |  [optional] |
|**jpegQuality** | **BigDecimal** | Quality for saved jpeg images |  [optional] |
|**webpLossless** | **Object** | Use lossless compression for webp images |  [optional] |
|**exportFor4chan** | **Boolean** | Save copy of large images as JPG |  [optional] |
|**imgDownscaleThreshold** | **BigDecimal** | File size limit for the above option, MB |  [optional] |
|**targetSideLength** | **BigDecimal** | Width/height limit for the above option, in pixels |  [optional] |
|**imgMaxSizeMp** | **BigDecimal** | Maximum image size |  [optional] |
|**useOriginalNameBatch** | **Boolean** | Use original name for output filename during batch process in extras tab |  [optional] |
|**useUpscalerNameAsSuffix** | **Object** | Use upscaler name as filename suffix in the extras tab |  [optional] |
|**saveSelectedOnly** | **Boolean** | When using &#39;Save&#39; button, only save a single selected image |  [optional] |
|**saveInitImg** | **Object** | Save init images when using img2img |  [optional] |
|**tempDir** | **Object** | Directory for temporary images; leave empty for default |  [optional] |
|**cleanTempDirAtStart** | **Object** | Cleanup non-default temporary directory when starting webui |  [optional] |
|**saveIncompleteImages** | **Object** | Save incomplete images |  [optional] |
|**outdirSamples** | **Object** | Output directory for images; if empty, defaults to three directories below |  [optional] |
|**outdirTxt2imgSamples** | **String** | Output directory for txt2img images |  [optional] |
|**outdirImg2imgSamples** | **String** | Output directory for img2img images |  [optional] |
|**outdirExtrasSamples** | **String** | Output directory for images from extras tab |  [optional] |
|**outdirGrids** | **Object** | Output directory for grids; if empty, defaults to two directories below |  [optional] |
|**outdirTxt2imgGrids** | **String** | Output directory for txt2img grids |  [optional] |
|**outdirImg2imgGrids** | **String** | Output directory for img2img grids |  [optional] |
|**outdirSave** | **String** | Directory for saving images using the Save button |  [optional] |
|**outdirInitImages** | **String** | Directory for saving init images when using img2img |  [optional] |
|**saveToDirs** | **Boolean** | Save images to a subdirectory |  [optional] |
|**gridSaveToDirs** | **Boolean** | Save grids to a subdirectory |  [optional] |
|**useSaveToDirsForUi** | **Object** | When using \&quot;Save\&quot; button, save images to a subdirectory |  [optional] |
|**directoriesFilenamePattern** | **String** | Directory name pattern |  [optional] |
|**directoriesMaxPromptWords** | **BigDecimal** | Max prompt words for [prompt_words] pattern |  [optional] |
|**esRGANTile** | **BigDecimal** | Tile size for ESRGAN upscalers. |  [optional] |
|**esRGANTileOverlap** | **BigDecimal** | Tile overlap for ESRGAN upscalers. |  [optional] |
|**realesrganEnabledModels** | **List&lt;Object&gt;** | Select which Real-ESRGAN models to show in the web UI. |  [optional] |
|**upscalerForImg2img** | **Object** | Upscaler for img2img |  [optional] |
|**faceRestoration** | **Object** | Restore faces |  [optional] |
|**faceRestorationModel** | **String** | Face restoration model |  [optional] |
|**codeFormerWeight** | **BigDecimal** | CodeFormer weight |  [optional] |
|**faceRestorationUnload** | **Object** | Move face restoration model from VRAM into RAM after processing |  [optional] |
|**autoLaunchBrowser** | **String** | Automatically open webui in browser on startup |  [optional] |
|**showWarnings** | **Object** | Show warnings in console. |  [optional] |
|**showGradioDeprecationWarnings** | **Boolean** | Show gradio deprecation warnings in console. |  [optional] |
|**memmonPollRate** | **BigDecimal** | VRAM usage polls per second during generation. |  [optional] |
|**samplesLogStdout** | **Object** | Always print all generation info to standard output |  [optional] |
|**multipleTqdm** | **Boolean** | Add a second progress bar to the console that shows progress for an entire job. |  [optional] |
|**printHypernetExtra** | **Object** | Print extra hypernetwork information to console. |  [optional] |
|**listHiddenFiles** | **Boolean** | Load models/files in hidden directories |  [optional] |
|**disableMmapLoadSafetensors** | **Object** | Disable memmapping for loading .safetensors files. |  [optional] |
|**hideLdmPrints** | **Boolean** | Prevent Stability-AI&#39;s ldm/sgm modules from printing noise to console. |  [optional] |
|**apiEnableRequests** | **Boolean** | Allow http:// and https:// URLs for input images in API |  [optional] |
|**apiForbidLocalRequests** | **Boolean** | Forbid URLs to local resources |  [optional] |
|**apiUseragent** | **Object** | User agent for requests |  [optional] |
|**unloadModelsWhenTraining** | **Object** | Move VAE and CLIP to RAM when training if possible. Saves VRAM. |  [optional] |
|**pinMemory** | **Object** | Turn on pin_memory for DataLoader. Makes training slightly faster but can increase memory usage. |  [optional] |
|**saveOptimizerState** | **Object** | Saves Optimizer state as separate *.optim file. Training of embedding or HN can be resumed with the matching optim file. |  [optional] |
|**saveTrainingSettingsToTxt** | **Boolean** | Save textual inversion and hypernet settings to a text file whenever training starts. |  [optional] |
|**datasetFilenameWordRegex** | **Object** | Filename word regex |  [optional] |
|**datasetFilenameJoinString** | **String** | Filename join string |  [optional] |
|**trainingImageRepeatsPerEpoch** | **BigDecimal** | Number of repeats for a single input image per epoch; used only for displaying epoch number |  [optional] |
|**trainingWriteCsvEvery** | **BigDecimal** | Save an csv containing the loss to log directory every N steps, 0 to disable |  [optional] |
|**trainingXattentionOptimizations** | **Object** | Use cross attention optimizations while training |  [optional] |
|**trainingEnableTensorboard** | **Object** | Enable tensorboard logging. |  [optional] |
|**trainingTensorboardSaveImages** | **Object** | Save generated images within tensorboard. |  [optional] |
|**trainingTensorboardFlushEvery** | **BigDecimal** | How often, in seconds, to flush the pending tensorboard events and summaries to disk. |  [optional] |
|**sdModelCheckpoint** | **Object** | Stable Diffusion checkpoint |  [optional] |
|**sdCheckpointsLimit** | **BigDecimal** | Maximum number of checkpoints loaded at the same time |  [optional] |
|**sdCheckpointsKeepInCpu** | **Boolean** | Only keep one model on device |  [optional] |
|**sdCheckpointCache** | **Object** | Checkpoints to cache in RAM |  [optional] |
|**sdUnet** | **String** | SD Unet |  [optional] |
|**enableQuantization** | **Object** | Enable quantization in K samplers for sharper and cleaner results. This may change existing seeds |  [optional] |
|**enableEmphasis** | **Boolean** | Enable emphasis |  [optional] |
|**enableBatchSeeds** | **Boolean** | Make K-diffusion samplers produce same images in a batch as when making a single image |  [optional] |
|**commaPaddingBacktrack** | **BigDecimal** | Prompt word wrap length limit |  [optional] |
|**clIPStopAtLastLayers** | **BigDecimal** | Clip skip |  [optional] |
|**upcastAttn** | **Object** | Upcast cross attention layer to float32 |  [optional] |
|**randnSource** | **String** | Random number generator source. |  [optional] |
|**tiling** | **Object** | Tiling |  [optional] |
|**hiresFixRefinerPass** | **String** | Hires fix: which pass to enable refiner for |  [optional] |
|**sdxlCropTop** | **Object** | crop top coordinate |  [optional] |
|**sdxlCropLeft** | **Object** | crop left coordinate |  [optional] |
|**sdxlRefinerLowAestheticScore** | **BigDecimal** | SDXL low aesthetic score |  [optional] |
|**sdxlRefinerHighAestheticScore** | **BigDecimal** | SDXL high aesthetic score |  [optional] |
|**sdVaeExplanation** | **String** |  |  [optional] |
|**sdVaeCheckpointCache** | **Object** | VAE Checkpoints to cache in RAM |  [optional] |
|**sdVae** | **String** | SD VAE |  [optional] |
|**sdVaeOverridesPerModelPreferences** | **Boolean** | Selected VAE overrides per-model preferences |  [optional] |
|**autoVaePrecision** | **Boolean** | Automatically revert VAE to 32-bit floats |  [optional] |
|**sdVaeEncodeMethod** | **String** | VAE type for encode |  [optional] |
|**sdVaeDecodeMethod** | **String** | VAE type for decode |  [optional] |
|**inpaintingMaskWeight** | **BigDecimal** | Inpainting conditioning mask strength |  [optional] |
|**initialNoiseMultiplier** | **BigDecimal** | Noise multiplier for img2img |  [optional] |
|**img2imgExtraNoise** | **Object** | Extra noise multiplier for img2img and hires fix |  [optional] |
|**img2imgColorCorrection** | **Object** | Apply color correction to img2img results to match original colors. |  [optional] |
|**img2imgFixSteps** | **Object** | With img2img, do exactly the amount of steps the slider specifies. |  [optional] |
|**img2imgBackgroundColor** | **String** | With img2img, fill transparent parts of the input image with this color. |  [optional] |
|**img2imgEditorHeight** | **BigDecimal** | Height of the image editor |  [optional] |
|**img2imgSketchDefaultBrushColor** | **String** | Sketch initial brush color |  [optional] |
|**img2imgInpaintMaskBrushColor** | **String** | Inpaint mask brush color |  [optional] |
|**img2imgInpaintSketchDefaultBrushColor** | **String** | Inpaint sketch initial brush color |  [optional] |
|**returnMask** | **Object** | For inpainting, include the greyscale mask in results for web |  [optional] |
|**returnMaskComposite** | **Object** | For inpainting, include masked composite in results for web |  [optional] |
|**crossAttentionOptimization** | **String** | Cross attention optimization |  [optional] |
|**sMinUncond** | **Object** | Negative Guidance minimum sigma |  [optional] |
|**tokenMergingRatio** | **Object** | Token merging ratio |  [optional] |
|**tokenMergingRatioImg2img** | **Object** | Token merging ratio for img2img |  [optional] |
|**tokenMergingRatioHr** | **Object** | Token merging ratio for high-res pass |  [optional] |
|**padCondUncond** | **Object** | Pad prompt/negative prompt to be same length |  [optional] |
|**persistentCondCache** | **Boolean** | Persistent cond cache |  [optional] |
|**batchCondUncond** | **Boolean** | Batch cond/uncond |  [optional] |
|**useOldEmphasisImplementation** | **Object** | Use old emphasis implementation. Can be useful to reproduce old seeds. |  [optional] |
|**useOldKarrasSchedulerSigmas** | **Object** | Use old karras scheduler sigmas (0.1 to 10). |  [optional] |
|**noDpmppSdeBatchDeterminism** | **Object** | Do not make DPM++ SDE deterministic across different batch sizes. |  [optional] |
|**useOldHiresFixWidthHeight** | **Object** | For hires fix, use width/height sliders to set final resolution rather than first pass (disables Upscale by, Resize width/height to). |  [optional] |
|**dontFixSecondOrderSamplersSchedule** | **Object** | Do not fix prompt schedule for second order samplers. |  [optional] |
|**hiresFixUseFirstpassConds** | **Object** | For hires fix, calculate conds of second pass using extra networks of first pass. |  [optional] |
|**useOldScheduling** | **Object** | Use old prompt editing timelines. |  [optional] |
|**interrogateKeepModelsInMemory** | **Object** | Keep models in VRAM |  [optional] |
|**interrogateReturnRanks** | **Object** | Include ranks of model tags matches in results. |  [optional] |
|**interrogateClipNumBeams** | **BigDecimal** | BLIP: num_beams |  [optional] |
|**interrogateClipMinLength** | **BigDecimal** | BLIP: minimum description length |  [optional] |
|**interrogateClipMaxLength** | **BigDecimal** | BLIP: maximum description length |  [optional] |
|**interrogateClipDictLimit** | **BigDecimal** | CLIP: maximum number of lines in text file |  [optional] |
|**interrogateClipSkipCategories** | **Object** | CLIP: skip inquire categories |  [optional] |
|**interrogateDeepbooruScoreThreshold** | **BigDecimal** | deepbooru: score threshold |  [optional] |
|**deepbooruSortAlpha** | **Boolean** | deepbooru: sort tags alphabetically |  [optional] |
|**deepbooruUseSpaces** | **Boolean** | deepbooru: use spaces in tags |  [optional] |
|**deepbooruEscape** | **Boolean** | deepbooru: escape (\\) brackets |  [optional] |
|**deepbooruFilterTags** | **Object** | deepbooru: filter out those tags |  [optional] |
|**extraNetworksShowHiddenDirectories** | **Boolean** | Show hidden directories |  [optional] |
|**extraNetworksHiddenModels** | **String** | Show cards for models in hidden directories |  [optional] |
|**extraNetworksDefaultMultiplier** | **BigDecimal** | Default multiplier for extra networks |  [optional] |
|**extraNetworksCardWidth** | **Object** | Card width for Extra Networks |  [optional] |
|**extraNetworksCardHeight** | **Object** | Card height for Extra Networks |  [optional] |
|**extraNetworksCardTextScale** | **BigDecimal** | Card text scale |  [optional] |
|**extraNetworksCardShowDesc** | **Boolean** | Show description on card |  [optional] |
|**extraNetworksAddTextSeparator** | **String** | Extra networks separator |  [optional] |
|**uiExtraNetworksTabReorder** | **Object** | Extra networks tab order |  [optional] |
|**textualInversionPrintAtLoad** | **Object** | Print a list of Textual Inversion embeddings when loading model |  [optional] |
|**textualInversionAddHashesToInfotext** | **Boolean** | Add Textual Inversion hashes to infotext |  [optional] |
|**sdHypernetwork** | **String** | Add hypernetwork to prompt |  [optional] |
|**localization** | **String** | Localization |  [optional] |
|**gradioTheme** | **String** | Gradio theme |  [optional] |
|**gradioThemesCache** | **Boolean** | Cache gradio themes locally |  [optional] |
|**galleryHeight** | **Object** | Gallery height |  [optional] |
|**returnGrid** | **Boolean** | Show grid in results for web |  [optional] |
|**doNotShowImages** | **Object** | Do not show any images in results for web |  [optional] |
|**sendSeed** | **Boolean** | Send seed when sending prompt or image to other interface |  [optional] |
|**sendSize** | **Boolean** | Send size when sending prompt or image to another interface |  [optional] |
|**jsModalLightbox** | **Boolean** | Enable full page image viewer |  [optional] |
|**jsModalLightboxInitiallyZoomed** | **Boolean** | Show images zoomed in by default in full page image viewer |  [optional] |
|**jsModalLightboxGamepad** | **Object** | Navigate image viewer with gamepad |  [optional] |
|**jsModalLightboxGamepadRepeat** | **BigDecimal** | Gamepad repeat period, in milliseconds |  [optional] |
|**showProgressInTitle** | **Boolean** | Show generation progress in window title. |  [optional] |
|**samplersInDropdown** | **Boolean** | Use dropdown for sampler selection instead of radio group |  [optional] |
|**dimensionsAndBatchTogether** | **Boolean** | Show Width/Height and Batch sliders in same row |  [optional] |
|**keyeditPrecisionAttention** | **BigDecimal** | Ctrl+up/down precision when editing (attention:1.1) |  [optional] |
|**keyeditPrecisionExtra** | **BigDecimal** | Ctrl+up/down precision when editing &lt;extra networks:0.9&gt; |  [optional] |
|**keyeditDelimiters** | **String** | Ctrl+up/down word delimiters |  [optional] |
|**keyeditMove** | **Boolean** | Alt+left/right moves prompt elements |  [optional] |
|**quicksettingsList** | **List&lt;Object&gt;** | Quicksettings list |  [optional] |
|**uiTabOrder** | **Object** | UI tab order |  [optional] |
|**hiddenTabs** | **Object** | Hidden UI tabs |  [optional] |
|**uiReorderList** | **Object** | txt2img/img2img UI item order |  [optional] |
|**hiresFixShowSampler** | **Object** | Hires fix: show hires checkpoint and sampler selection |  [optional] |
|**hiresFixShowPrompts** | **Object** | Hires fix: show hires prompt and negative prompt |  [optional] |
|**disableTokenCounters** | **Object** | Disable prompt token counters |  [optional] |
|**addModelHashToInfo** | **Boolean** | Add model hash to generation information |  [optional] |
|**addModelNameToInfo** | **Boolean** | Add model name to generation information |  [optional] |
|**addUserNameToInfo** | **Object** | Add user name to generation information when authenticated |  [optional] |
|**addVersionToInfotext** | **Boolean** | Add program version to generation information |  [optional] |
|**disableWeightsAutoSwap** | **Boolean** | Disregard checkpoint information from pasted infotext |  [optional] |
|**infotextStyles** | **String** | Infer styles from prompts of pasted infotext |  [optional] |
|**showProgressbar** | **Boolean** | Show progressbar |  [optional] |
|**livePreviewsEnable** | **Boolean** | Show live previews of the created image |  [optional] |
|**livePreviewsImageFormat** | **String** | Live preview file format |  [optional] |
|**showProgressGrid** | **Boolean** | Show previews of all images generated in a batch as a grid |  [optional] |
|**showProgressEveryNSteps** | **BigDecimal** | Live preview display period |  [optional] |
|**showProgressType** | **String** | Live preview method |  [optional] |
|**livePreviewAllowLowvramFull** | **Object** | Allow Full live preview method with lowvram/medvram |  [optional] |
|**livePreviewContent** | **String** | Live preview subject |  [optional] |
|**livePreviewRefreshPeriod** | **BigDecimal** | Progressbar and preview update period |  [optional] |
|**livePreviewFastInterrupt** | **Object** | Return image with chosen live preview method on interrupt |  [optional] |
|**hideSamplers** | **Object** | Hide samplers in user interface |  [optional] |
|**etaDdim** | **Object** | Eta for DDIM |  [optional] |
|**etaAncestral** | **BigDecimal** | Eta for k-diffusion samplers |  [optional] |
|**ddimDiscretize** | **String** | img2img DDIM discretize |  [optional] |
|**sChurn** | **Object** | sigma churn |  [optional] |
|**sTmin** | **Object** | sigma tmin |  [optional] |
|**sTmax** | **Object** | sigma tmax |  [optional] |
|**sNoise** | **BigDecimal** | sigma noise |  [optional] |
|**kSchedType** | **String** | Scheduler type |  [optional] |
|**sigmaMin** | **Object** | sigma min |  [optional] |
|**sigmaMax** | **Object** | sigma max |  [optional] |
|**rho** | **Object** | rho |  [optional] |
|**etaNoiseSeedDelta** | **Object** | Eta noise seed delta |  [optional] |
|**alwaysDiscardNextToLastSigma** | **Object** | Always discard next-to-last sigma |  [optional] |
|**sgmNoiseMultiplier** | **Object** | SGM noise multiplier |  [optional] |
|**uniPcVariant** | **String** | UniPC variant |  [optional] |
|**uniPcSkipType** | **String** | UniPC skip type |  [optional] |
|**uniPcOrder** | **BigDecimal** | UniPC order |  [optional] |
|**uniPcLowerOrderFinal** | **Boolean** | UniPC lower order final |  [optional] |
|**postprocessingEnableInMainUi** | **Object** | Enable postprocessing operations in txt2img and img2img tabs |  [optional] |
|**postprocessingOperationOrder** | **Object** | Postprocessing operation order |  [optional] |
|**upscalingMaxImagesInCache** | **BigDecimal** | Maximum number of images in upscaling cache |  [optional] |
|**disabledExtensions** | **Object** | Disable these extensions |  [optional] |
|**disableAllExtensions** | **String** | Disable all extensions (preserves the list of disabled extensions) |  [optional] |
|**restoreConfigStateFile** | **Object** | Config state file to restore from, under &#39;config-states/&#39; folder |  [optional] |
|**sdCheckpointHash** | **Object** | SHA256 hash of the current checkpoint |  [optional] |
|**sdLora** | **String** | Add network to prompt |  [optional] |
|**loraPreferredName** | **String** | When adding to prompt, refer to Lora by |  [optional] |
|**loraAddHashesToInfotext** | **Boolean** | Add Lora hashes to infotext |  [optional] |
|**loraShowAll** | **Object** | Always show all networks on the Lora page |  [optional] |
|**loraHideUnknownForVersions** | **Object** | Hide networks of unknown versions for model versions |  [optional] |
|**loraInMemoryLimit** | **Object** | Number of Lora networks to keep cached in memory |  [optional] |
|**loraFunctional** | **Object** | Lora/Networks: use old method that takes longer when you have multiple Loras active and produces same results as kohya-ss/sd-webui-additional-networks extension |  [optional] |
|**canvasHotkeyZoom** | **String** | Zoom canvas |  [optional] |
|**canvasHotkeyAdjust** | **String** | Adjust brush size |  [optional] |
|**canvasHotkeyMove** | **String** | Moving the canvas |  [optional] |
|**canvasHotkeyFullscreen** | **String** | Fullscreen Mode, maximizes the picture so that it fits into the screen and stretches it to its full width  |  [optional] |
|**canvasHotkeyReset** | **String** | Reset zoom and canvas positon |  [optional] |
|**canvasHotkeyOverlap** | **String** | Toggle overlap |  [optional] |
|**canvasShowTooltip** | **Boolean** | Enable tooltip on the canvas |  [optional] |
|**canvasAutoExpand** | **Boolean** | Automatically expands an image that does not fit completely in the canvas area, similar to manually pressing the S and R buttons |  [optional] |
|**canvasBlurPrompt** | **Object** | Take the focus off the prompt when working with a canvas |  [optional] |
|**canvasDisabledFunctions** | **List&lt;Object&gt;** | Disable function that you don&#39;t use |  [optional] |
|**extraOptionsTxt2img** | **Object** | Options in main UI - txt2img |  [optional] |
|**extraOptionsImg2img** | **Object** | Options in main UI - img2img |  [optional] |
|**extraOptionsCols** | **BigDecimal** | Options in main UI - number of columns |  [optional] |
|**extraOptionsAccordion** | **Object** | Options in main UI - place into an accordion |  [optional] |



