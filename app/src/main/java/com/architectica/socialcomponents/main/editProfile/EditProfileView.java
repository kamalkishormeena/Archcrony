/*
 * Copyright 2018 Rozdoum
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.architectica.socialcomponents.main.editProfile;

import com.architectica.socialcomponents.main.pickImageBase.PickImageView;

import java.util.List;

/**
 * Created by Alexey on 03.05.18.
 */

public interface EditProfileView extends PickImageView {
    void setName(String username);
    void setUsertype(String usertype);
    void setProfilePhoto(String photoUrl);
    void setUseruri(String Useruri);
    void setBio(String bio);
    void setPhoneNumber(String number);
    void setSkill(String userType,String skill);

    String getNameText();
    String getUseruriText();
    String getBioText();
    String getNumber();
    String getUsertypeText();
    String getSkill();

    void setNameError(String string);
    void setSkillError(String string);
}
