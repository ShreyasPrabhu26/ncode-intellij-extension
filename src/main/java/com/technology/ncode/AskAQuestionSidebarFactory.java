package com.technology.ncode;

import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import org.jetbrains.annotations.NotNull;

public class AskAQuestionSidebarFactory implements ToolWindowFactory, DumbAware {
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        AskAQuestionSidebar askAQuestionSidebar = new AskAQuestionSidebar();
        toolWindow.getComponent().add(askAQuestionSidebar.createSidebar());
    }
}
