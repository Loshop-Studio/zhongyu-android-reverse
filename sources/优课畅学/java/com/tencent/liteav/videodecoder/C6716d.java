package com.tencent.liteav.videodecoder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.tencent.liteav.videodecoder.d */
/* loaded from: classes4.dex */
public class C6716d {

    /* renamed from: a */
    private boolean f6354a = false;

    /* renamed from: b */
    private void m5705b(C6715c c6715c) throws IOException {
        if (c6715c.m5701d("VUI: aspect_ratio_info_present_flag") && ((int) c6715c.m5686a(8, "VUI: aspect_ratio")) == 255) {
            c6715c.m5694b(16, "VUI: sar_width");
            c6715c.m5694b(16, "VUI: sar_height");
        }
        if (c6715c.m5701d("VUI: overscan_info_present_flag")) {
            c6715c.m5694b(1, "VUI: overscan_appropriate_flag");
        }
        if (c6715c.m5701d("VUI: video_signal_type_present_flag")) {
            c6715c.m5694b(3, "VUI: video_format");
            c6715c.m5694b(1, "VUI: video_full_range_flag");
            if (c6715c.m5701d("VUI: colour_description_present_flag")) {
                c6715c.m5694b(8, "VUI: colour_primaries");
                c6715c.m5694b(8, "VUI: transfer_characteristics");
                c6715c.m5694b(8, "VUI: matrix_coefficients");
            }
        }
        if (c6715c.m5701d("VUI: chroma_loc_info_present_flag")) {
            c6715c.m5695b("VUI chroma_sample_loc_type_top_field");
            c6715c.m5695b("VUI chroma_sample_loc_type_bottom_field");
        }
        if (c6715c.m5701d("VUI: timing_info_present_flag")) {
            c6715c.m5694b(32, "VUI: num_units_in_tick");
            c6715c.m5694b(32, "VUI: time_scale");
            c6715c.m5694b(1, "VUI: fixed_frame_rate_flag");
        }
        boolean zM5701d = c6715c.m5701d("VUI: nal_hrd_parameters_present_flag");
        if (zM5701d) {
            m5704a(c6715c);
        }
        boolean zM5701d2 = c6715c.m5701d("VUI: vcl_hrd_parameters_present_flag");
        if (zM5701d2) {
            m5704a(c6715c);
        }
        if (zM5701d || zM5701d2) {
            c6715c.m5694b(1, "VUI: low_delay_hrd_flag");
        }
        c6715c.m5694b(1, "VUI: pic_struct_present_flag");
        if (c6715c.m5703e("VUI: bitstream_restriction_flag")) {
            c6715c.m5689a(true, "VUI: set bitstream_restriction_flag");
            c6715c.m5701d("VUI: motion_vectors_over_pic_boundaries_flag");
            c6715c.m5695b("VUI max_bytes_per_pic_denom");
            c6715c.m5695b("VUI max_bits_per_mb_denom");
            c6715c.m5695b("VUI log2_max_mv_length_horizontal");
            c6715c.m5695b("VUI log2_max_mv_length_vertical");
            c6715c.m5695b("VUI num_reorder_frames");
            c6715c.m5699c(1, "VUI: max_dec_frame_buffering");
            return;
        }
        c6715c.m5689a(true, "VUI: set bitstream_restriction_flag");
        c6715c.m5689a(true, "VUI: motion_vectors_over_pic_boundaries_flag");
        c6715c.m5699c(0, "VUI: max_bytes_per_pic_denom");
        c6715c.m5699c(0, "VUI: max_bits_per_mb_denom");
        c6715c.m5699c(10, "VUI: log2_max_mv_length_horizontal");
        c6715c.m5699c(10, "VUI: log2_max_mv_length_vertical");
        c6715c.m5699c(0, "VUI: num_reorder_frames");
        c6715c.m5699c(1, "VUI: max_dec_frame_buffering");
    }

    /* renamed from: a */
    public byte[] m5707a(byte[] bArr) {
        if (this.f6354a) {
            String str = "";
            for (byte b10 : bArr) {
                String hexString = Integer.toHexString(b10 & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                str = str + " " + hexString;
            }
        }
        return m5706a(new ByteArrayInputStream(bArr));
    }

    /* renamed from: a */
    public byte[] m5706a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C6715c c6715c = new C6715c(inputStream, byteArrayOutputStream);
        c6715c.m5694b(8, "NALU type");
        int iM5686a = (int) c6715c.m5686a(8, "SPS: profile_idc");
        c6715c.m5694b(8, "SPS: constraint_set_0-3_flag and reserved_zero_4bits");
        c6715c.m5686a(8, "SPS: level_idc");
        c6715c.m5695b("SPS: seq_parameter_set_id");
        if (iM5686a == 100 || iM5686a == 110 || iM5686a == 122 || iM5686a == 144) {
            if (c6715c.m5684a("SPS: chroma_format_idc") == 3) {
                c6715c.m5694b(1, "SPS: residual_color_transform_flag");
            }
            c6715c.m5695b("SPS: bit_depth_luma_minus8");
            c6715c.m5695b("SPS: bit_depth_chroma_minus8");
            c6715c.m5694b(1, "SPS: qpprime_y_zero_transform_bypass_flag");
            if (c6715c.m5701d("SPS: seq_scaling_matrix_present_lag")) {
                for (int i10 = 0; i10 < 8; i10++) {
                    if (c6715c.m5701d("SPS: seqScalingListPresentFlag")) {
                        if (i10 < 6) {
                            c6715c.m5698c(16);
                        } else {
                            c6715c.m5698c(64);
                        }
                    }
                }
            }
        }
        c6715c.m5695b("SPS: log2_max_frame_num_minus4");
        int iM5684a = c6715c.m5684a("SPS: pic_order_cnt_type");
        if (iM5684a == 0) {
            c6715c.m5695b("SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (iM5684a == 1) {
            c6715c.m5694b(1, "SPS: delta_pic_order_always_zero_flag");
            c6715c.m5695b("SPS: offset_for_non_ref_pic");
            c6715c.m5695b("SPS: offset_for_top_to_bottom_field");
            int iM5684a2 = c6715c.m5684a("SPS: num_ref_frames_in_pic_order_cnt_cycle");
            for (int i11 = 0; i11 < iM5684a2; i11++) {
                c6715c.m5695b("SPS: offsetForRefFrame [" + i11 + "]");
            }
        }
        c6715c.m5684a("SPS: num_ref_frames");
        c6715c.m5694b(1, "SPS: gaps_in_frame_num_value_allowed_flag");
        c6715c.m5695b("SPS: pic_width_in_mbs_minus1");
        c6715c.m5695b("SPS: pic_height_in_map_units_minus1");
        if (!c6715c.m5701d("SPS: frame_mbs_only_flag")) {
            c6715c.m5694b(1, "SPS: mb_adaptive_frame_field_flag");
        }
        c6715c.m5694b(1, "SPS: direct_8x8_inference_flag");
        if (c6715c.m5701d("SPS: frame_cropping_flag")) {
            c6715c.m5695b("SPS: frame_crop_left_offset");
            c6715c.m5695b("SPS: frame_crop_right_offset");
            c6715c.m5695b("SPS: frame_crop_top_offset");
            c6715c.m5695b("SPS: frame_crop_bottom_offset");
        }
        if (c6715c.m5703e("SPS: vui_parameters_present_flag")) {
            c6715c.m5689a(true, "VUI set 1: ");
            m5705b(c6715c);
        } else {
            c6715c.m5689a(true, "VUI set 1: ");
            c6715c.m5689a(false, "VUI: aspect_ratio_info_present_flag");
            c6715c.m5689a(false, "VUI: overscan_info_present_flag");
            c6715c.m5689a(false, "VUI: video_signal_type_present_flag");
            c6715c.m5689a(false, "VUI: chroma_loc_info_present_flag");
            c6715c.m5689a(false, "VUI: timing_info_present_flag");
            c6715c.m5689a(false, "VUI: nal_hrd_parameters_present_flag");
            c6715c.m5689a(false, "VUI: vcl_hrd_parameters_present_flag");
            c6715c.m5689a(false, "VUI: pic_struct_present_flag");
            c6715c.m5689a(true, "VUI: bitstream_restriction_flag");
            c6715c.m5689a(true, "VUI: motion_vectors_over_pic_boundaries_flag");
            c6715c.m5699c(0, "VUI: max_bytes_per_pic_denom");
            c6715c.m5699c(0, "VUI: max_bits_per_mb_denom");
            c6715c.m5699c(10, "VUI: log2_max_mv_length_horizontal");
            c6715c.m5699c(10, "VUI: log2_max_mv_length_vertical");
            c6715c.m5699c(0, "VUI: num_reorder_frames");
            c6715c.m5699c(1, "VUI: max_dec_frame_buffering");
        }
        c6715c.m5697c();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (this.f6354a) {
            String str = "";
            for (byte b10 : byteArray) {
                String hexString = Integer.toHexString(b10 & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                str = str + " " + hexString;
            }
        }
        return byteArray;
    }

    /* renamed from: a */
    private void m5704a(C6715c c6715c) throws IOException {
        int iM5684a = c6715c.m5684a("SPS: cpb_cnt_minus1");
        c6715c.m5694b(4, "HRD: bit_rate_scale");
        c6715c.m5694b(4, "HRD: cpb_size_scale");
        for (int i10 = 0; i10 <= iM5684a; i10++) {
            c6715c.m5695b("HRD: bit_rate_value_minus1");
            c6715c.m5695b("HRD: cpb_size_value_minus1");
            c6715c.m5694b(1, "HRD: cbr_flag");
        }
        c6715c.m5694b(5, "HRD: initial_cpb_removal_delay_length_minus1");
        c6715c.m5694b(5, "HRD: cpb_removal_delay_length_minus1");
        c6715c.m5694b(5, "HRD: dpb_output_delay_length_minus1");
        c6715c.m5694b(5, "HRD: time_offset_length");
    }
}
