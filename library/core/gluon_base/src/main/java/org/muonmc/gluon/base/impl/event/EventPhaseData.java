/*
 * Copyright 2021, 2022, 2023, 2024 The Quilt Project
 * Copyright 2024 MuonMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.muonmc.gluon.base.impl.event;

import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.ApiStatus;
import org.muonmc.gluon.base.api.phase.PhaseData;
import org.quiltmc.loader.api.ModInternal;

import java.lang.reflect.Array;
import java.util.Arrays;

@ModInternal
@ApiStatus.Internal
public final class EventPhaseData<T> extends PhaseData<T[], EventPhaseData<T>> {
	@SuppressWarnings("unchecked")
	public EventPhaseData(ResourceLocation id, Class<?> listenerClass) {
		super(id, (T[]) Array.newInstance(listenerClass, 0));
	}

	public void addListener(T listener) {
		int oldLength = this.data.length;
		this.data = Arrays.copyOf(data, oldLength + 1);
		this.data[oldLength] = listener;
	}
}
