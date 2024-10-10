package app.notifee.core.model;

/*
 * Copyright (c) 2016-present Invertase Limited & Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this library except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.Objects;

@Keep
public class NotificationAndroidCustomLayoutModel {
  private static final String TAG = "NotificationAndroidCustomLayoutModel";
  private Bundle mNotificationAndroidCustomLayoutBundle;

  private NotificationAndroidCustomLayoutModel(Bundle bundle) {
    mNotificationAndroidCustomLayoutBundle = bundle;
  }

  public static NotificationAndroidCustomLayoutModel fromBundle(Bundle bundle) {
    return new NotificationAndroidCustomLayoutModel(bundle);
  }

  /**
   * Gets title in custom layout bundle
   *
   * @return String
   */
  public @NonNull String getCustomLayoutTitle() {
    if (mNotificationAndroidCustomLayoutBundle.containsKey("title")) {
      return Objects.requireNonNull(mNotificationAndroidCustomLayoutBundle.getString("title"));
    }

    return "";
  }

  /**
   * Gets description in custom layout bundle
   *
   * @return String
   */
  public @NonNull String getCustomLayoutDesc() {
    if (mNotificationAndroidCustomLayoutBundle.containsKey("description")) {
      return Objects.requireNonNull(mNotificationAndroidCustomLayoutBundle.getString("description"));
    }

    return "";
  }
}
