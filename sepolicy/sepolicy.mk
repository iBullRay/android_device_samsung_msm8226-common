# Board specific SELinux policy variable definitions
BOARD_SEPOLICY_DIRS := \
       $(BOARD_SEPOLICY_DIRS) \
       device/samsung/msm8226-common/sepolicy/common \
       device/samsung/msm8226-common/sepolicy/test \
       device/samsung/msm8226-common/sepolicy/msm8226

-include device/samsung/msm8226-common/sepolicy/aosp/sepolicy.mk