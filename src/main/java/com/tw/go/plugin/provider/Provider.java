package com.tw.go.plugin.provider;

import com.tw.go.plugin.setting.PluginConfigurationView;
import com.tw.go.plugin.setting.PluginSettings;

import java.util.List;
import java.util.Map;

public interface Provider {
    public String pluginId();

    public String pollerPluginId();

    public void updateStatus(PluginSettings pluginSettings, String branch, String revision, String pipelineStage,
                             String result, String trackbackURL, String repository) throws Exception;

    public List<Map<String, Object>> validateConfig(Map<String, Object> fields);

    public PluginConfigurationView configurationView();

    public PluginSettings pluginSettings(Map<String, String> responseBodyMap);
}
