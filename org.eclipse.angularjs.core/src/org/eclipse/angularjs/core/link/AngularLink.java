/**
 *  Copyright (c) 2013-2014 Angelo ZERR.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 */
package org.eclipse.angularjs.core.link;

public class AngularLink {

	private final String elementId;
	private final String module;
	private final String controller;

	public AngularLink(String elementId, String module, String controller) {
		this.elementId = elementId;
		this.module = module;
		this.controller = controller;
	}

	public String getElementId() {
		return elementId;
	}

	public String getModule() {
		return module;
	}

	public String getController() {
		return controller;
	}
}
