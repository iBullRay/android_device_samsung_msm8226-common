#
# This policy configuration will be used by all products that
# inherit from AOSP
#

BOARD_SEPOLICY_DIRS += \
    device/samsung/msm8226-common/sepolicy/aosp

-include device/samsung/msm8226-common/sepolicy/aosp/qcom/sepolicy.mk
