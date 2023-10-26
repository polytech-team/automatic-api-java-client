

# ExtrasSingleImageRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resizeMode** | [**ResizeModeEnum**](#ResizeModeEnum) | Sets the resize mode: 0 to upscale by upscaling_resize amount, 1 to upscale up to upscaling_resize_h x upscaling_resize_w. |  [optional] |
|**showExtrasResults** | **Boolean** | Should the backend return the generated image? |  [optional] |
|**gfpganVisibility** | **BigDecimal** | Sets the visibility of GFPGAN, values should be between 0 and 1. |  [optional] |
|**codeformerVisibility** | **BigDecimal** | Sets the visibility of CodeFormer, values should be between 0 and 1. |  [optional] |
|**codeformerWeight** | **BigDecimal** | Sets the weight of CodeFormer, values should be between 0 and 1. |  [optional] |
|**upscalingResize** | **BigDecimal** | By how much to upscale the image, only used when resize_mode&#x3D;0. |  [optional] |
|**upscalingResizeW** | **Integer** | Target width for the upscaler to hit. Only used when resize_mode&#x3D;1. |  [optional] |
|**upscalingResizeH** | **Integer** | Target height for the upscaler to hit. Only used when resize_mode&#x3D;1. |  [optional] |
|**upscalingCrop** | **Boolean** | Should the upscaler crop the image to fit in the chosen size? |  [optional] |
|**upscaler1** | **String** | The name of the main upscaler to use, it has to be one of this list: None , Lanczos , Nearest , ESRGAN_4x , LDSR , R-ESRGAN 4x+ , R-ESRGAN 4x+ Anime6B , ScuNET GAN , ScuNET PSNR , SwinIR 4x |  [optional] |
|**upscaler2** | **String** | The name of the secondary upscaler to use, it has to be one of this list: None , Lanczos , Nearest , ESRGAN_4x , LDSR , R-ESRGAN 4x+ , R-ESRGAN 4x+ Anime6B , ScuNET GAN , ScuNET PSNR , SwinIR 4x |  [optional] |
|**extrasUpscaler2Visibility** | **BigDecimal** | Sets the visibility of secondary upscaler, values should be between 0 and 1. |  [optional] |
|**upscaleFirst** | **Boolean** | Should the upscaler run before restoring faces? |  [optional] |
|**image** | **String** | Image to work on, must be a Base64 string containing the image&#39;s data. |  [optional] |



## Enum: ResizeModeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



