/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.contrib.aws.resource;

import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;
import io.opentelemetry.sdk.autoconfigure.spi.ResourceProvider;
import io.opentelemetry.sdk.resources.Resource;

/** {@link ResourceProvider} for automatically configuring {@link Ec2Resource}. */
public final class Ec2ResourceProvider extends CloudResourceProvider {
  @Override
  public Resource createResource(ConfigProperties config) {
    return Ec2Resource.get();
  }
}
