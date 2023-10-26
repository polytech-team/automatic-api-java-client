

# ModulesProgressProgressResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** |  |  |
|**queued** | **Boolean** |  |  |
|**completed** | **Boolean** |  |  |
|**progress** | **BigDecimal** | The progress with a range of 0 to 1 |  [optional] |
|**eta** | **BigDecimal** |  |  [optional] |
|**livePreview** | **String** | Current live preview; a data: uri |  [optional] |
|**idLivePreview** | **Integer** | Send this together with next request to prevent receiving same image |  [optional] |
|**textinfo** | **String** | Info text used by WebUI. |  [optional] |



