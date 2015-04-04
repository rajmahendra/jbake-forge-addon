/**
 * Copyright 2014 JBake
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jbake.forge.addon.facets;

import org.jbake.forge.addon.types.BuildSystemType;
import org.jbake.forge.addon.types.TemplateType;
import org.jboss.forge.addon.facets.AbstractFacet;
import org.jboss.forge.addon.projects.Project;
import org.jboss.forge.addon.projects.ProjectFacet;
import org.jboss.forge.addon.projects.ProjectFactory;
import org.jboss.forge.addon.projects.dependencies.DependencyInstaller;

import javax.inject.Inject;
import java.io.IOException;


/**
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 *         modified by @author Mani Manasa Mylavarapu <manimanasamylavarapu@gmail.com>
 */
public abstract class AbstractJBakeFacet extends AbstractFacet<Project>
        implements ProjectFacet, JBakeFacet {

    public abstract BuildSystemType getBuildSystemType();

    public abstract void setBuildSystemType(BuildSystemType buildSystemType);

    public abstract TemplateType getTemplateType();


    public abstract void setTemplateType(TemplateType templateType);


    public abstract boolean install();


    public abstract void installMavenPluginDependencies();

    public abstract void installJbakeCoreDependencies();

    public abstract void createJbakeFolderStructure() throws IOException;

    public abstract boolean isJbakeFolderCreated();


    public abstract boolean isInstalled();

    /* public abstract void addRequiredDependency() ;

     public abstract boolean isDependencyRequirementsMet() ;
 */
    @Override
    public String toString() {
        return getSpecVersion().toString();
    }
}