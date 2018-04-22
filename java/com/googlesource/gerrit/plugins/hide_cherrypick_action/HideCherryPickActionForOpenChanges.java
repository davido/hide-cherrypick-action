// Copyright (C) 2018 The Android Open Source Project
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.googlesource.gerrit.plugins.hide_cherrypick_action;

import com.google.gerrit.extensions.annotations.Listen;
import com.google.gerrit.extensions.api.changes.ActionVisitor;
import com.google.gerrit.extensions.client.ChangeStatus;
import com.google.gerrit.extensions.common.ActionInfo;
import com.google.gerrit.extensions.common.ChangeInfo;
import com.google.gerrit.extensions.common.RevisionInfo;
import com.google.inject.Singleton;

@Listen
@Singleton
public class HideCherryPickActionForOpenChanges implements ActionVisitor {
  @Override
  public boolean visit(String name, ActionInfo actionInfo, ChangeInfo changeInfo) {
    return true;
  }

  @Override
  public boolean visit(
      String name, ActionInfo actionInfo, ChangeInfo changeInfo, RevisionInfo revisionInfo) {
    return (name.equals("cherrypick") && changeInfo.status != ChangeStatus.MERGED) ? false : true;
  }
}
