.class public Lcom/tencent/liteav/videodecoder/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/tencent/liteav/videodecoder/d;->a:Z

    .line 6
    .line 7
    return-void
.end method

.method private a(Lcom/tencent/liteav/videodecoder/c;)V
    .locals 4

    .line 75
    const-string v0, "SPS: cpb_cnt_minus1"

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videodecoder/c;->a(Ljava/lang/String;)I

    move-result v0

    .line 76
    const-string v1, "HRD: bit_rate_scale"

    const/4 v2, 0x4

    invoke-virtual {p1, v2, v1}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 77
    const-string v1, "HRD: cpb_size_scale"

    invoke-virtual {p1, v2, v1}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    const/4 v1, 0x0

    :goto_0
    if-gt v1, v0, :cond_0

    .line 78
    const-string v2, "HRD: bit_rate_value_minus1"

    invoke-virtual {p1, v2}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    .line 79
    const-string v2, "HRD: cpb_size_value_minus1"

    invoke-virtual {p1, v2}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    .line 80
    const-string v2, "HRD: cbr_flag"

    const/4 v3, 0x1

    invoke-virtual {p1, v3, v2}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 81
    :cond_0
    const-string v0, "HRD: initial_cpb_removal_delay_length_minus1"

    const/4 v1, 0x5

    invoke-virtual {p1, v1, v0}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 82
    const-string v0, "HRD: cpb_removal_delay_length_minus1"

    invoke-virtual {p1, v1, v0}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 83
    const-string v0, "HRD: dpb_output_delay_length_minus1"

    invoke-virtual {p1, v1, v0}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 84
    const-string v0, "HRD: time_offset_length"

    invoke-virtual {p1, v1, v0}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    return-void
.end method

.method private b(Lcom/tencent/liteav/videodecoder/c;)V
    .locals 5

    .line 1
    const-string v0, "VUI: aspect_ratio_info_present_flag"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videodecoder/c;->d(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, "VUI: aspect_ratio"

    .line 12
    .line 13
    invoke-virtual {p1, v1, v0}, Lcom/tencent/liteav/videodecoder/c;->a(ILjava/lang/String;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    long-to-int v0, v2

    .line 18
    const/16 v2, 0xff

    .line 19
    .line 20
    if-ne v0, v2, :cond_0

    .line 21
    .line 22
    const-string v0, "VUI: sar_width"

    .line 23
    .line 24
    const/16 v2, 0x10

    .line 25
    .line 26
    invoke-virtual {p1, v2, v0}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v0, "VUI: sar_height"

    .line 30
    .line 31
    invoke-virtual {p1, v2, v0}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    const-string v0, "VUI: overscan_info_present_flag"

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videodecoder/c;->d(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/4 v2, 0x1

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    const-string v0, "VUI: overscan_appropriate_flag"

    .line 44
    .line 45
    invoke-virtual {p1, v2, v0}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    const-string v0, "VUI: video_signal_type_present_flag"

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videodecoder/c;->d(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    const/4 v0, 0x3

    .line 57
    const-string v3, "VUI: video_format"

    .line 58
    .line 59
    invoke-virtual {p1, v0, v3}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v0, "VUI: video_full_range_flag"

    .line 63
    .line 64
    invoke-virtual {p1, v2, v0}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const-string v0, "VUI: colour_description_present_flag"

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videodecoder/c;->d(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    const-string v0, "VUI: colour_primaries"

    .line 76
    .line 77
    invoke-virtual {p1, v1, v0}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const-string v0, "VUI: transfer_characteristics"

    .line 81
    .line 82
    invoke-virtual {p1, v1, v0}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const-string v0, "VUI: matrix_coefficients"

    .line 86
    .line 87
    invoke-virtual {p1, v1, v0}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    const-string v0, "VUI: chroma_loc_info_present_flag"

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videodecoder/c;->d(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_3

    .line 97
    .line 98
    const-string v0, "VUI chroma_sample_loc_type_top_field"

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const-string v0, "VUI chroma_sample_loc_type_bottom_field"

    .line 104
    .line 105
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    const-string v0, "VUI: timing_info_present_flag"

    .line 109
    .line 110
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videodecoder/c;->d(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_4

    .line 115
    .line 116
    const-string v0, "VUI: num_units_in_tick"

    .line 117
    .line 118
    const/16 v1, 0x20

    .line 119
    .line 120
    invoke-virtual {p1, v1, v0}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 121
    .line 122
    .line 123
    const-string v0, "VUI: time_scale"

    .line 124
    .line 125
    invoke-virtual {p1, v1, v0}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 126
    .line 127
    .line 128
    const-string v0, "VUI: fixed_frame_rate_flag"

    .line 129
    .line 130
    invoke-virtual {p1, v2, v0}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_4
    const-string v0, "VUI: nal_hrd_parameters_present_flag"

    .line 134
    .line 135
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videodecoder/c;->d(Ljava/lang/String;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_5

    .line 140
    .line 141
    invoke-direct {p0, p1}, Lcom/tencent/liteav/videodecoder/d;->a(Lcom/tencent/liteav/videodecoder/c;)V

    .line 142
    .line 143
    .line 144
    :cond_5
    const-string v1, "VUI: vcl_hrd_parameters_present_flag"

    .line 145
    .line 146
    invoke-virtual {p1, v1}, Lcom/tencent/liteav/videodecoder/c;->d(Ljava/lang/String;)Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eqz v1, :cond_6

    .line 151
    .line 152
    invoke-direct {p0, p1}, Lcom/tencent/liteav/videodecoder/d;->a(Lcom/tencent/liteav/videodecoder/c;)V

    .line 153
    .line 154
    .line 155
    :cond_6
    if-nez v0, :cond_7

    .line 156
    .line 157
    if-eqz v1, :cond_8

    .line 158
    .line 159
    :cond_7
    const-string v0, "VUI: low_delay_hrd_flag"

    .line 160
    .line 161
    invoke-virtual {p1, v2, v0}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :cond_8
    const-string v0, "VUI: pic_struct_present_flag"

    .line 165
    .line 166
    invoke-virtual {p1, v2, v0}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const-string v0, "VUI: bitstream_restriction_flag"

    .line 170
    .line 171
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videodecoder/c;->e(Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    const-string v1, "VUI: max_dec_frame_buffering"

    .line 176
    .line 177
    const-string v3, "VUI: motion_vectors_over_pic_boundaries_flag"

    .line 178
    .line 179
    const-string v4, "VUI: set bitstream_restriction_flag"

    .line 180
    .line 181
    if-eqz v0, :cond_9

    .line 182
    .line 183
    invoke-virtual {p1, v2, v4}, Lcom/tencent/liteav/videodecoder/c;->a(ZLjava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1, v3}, Lcom/tencent/liteav/videodecoder/c;->d(Ljava/lang/String;)Z

    .line 187
    .line 188
    .line 189
    const-string v0, "VUI max_bytes_per_pic_denom"

    .line 190
    .line 191
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    const-string v0, "VUI max_bits_per_mb_denom"

    .line 195
    .line 196
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    const-string v0, "VUI log2_max_mv_length_horizontal"

    .line 200
    .line 201
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    const-string v0, "VUI log2_max_mv_length_vertical"

    .line 205
    .line 206
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    const-string v0, "VUI num_reorder_frames"

    .line 210
    .line 211
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1, v2, v1}, Lcom/tencent/liteav/videodecoder/c;->c(ILjava/lang/String;)V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :cond_9
    invoke-virtual {p1, v2, v4}, Lcom/tencent/liteav/videodecoder/c;->a(ZLjava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1, v2, v3}, Lcom/tencent/liteav/videodecoder/c;->a(ZLjava/lang/String;)V

    .line 222
    .line 223
    .line 224
    const-string v0, "VUI: max_bytes_per_pic_denom"

    .line 225
    .line 226
    const/4 v3, 0x0

    .line 227
    invoke-virtual {p1, v3, v0}, Lcom/tencent/liteav/videodecoder/c;->c(ILjava/lang/String;)V

    .line 228
    .line 229
    .line 230
    const-string v0, "VUI: max_bits_per_mb_denom"

    .line 231
    .line 232
    invoke-virtual {p1, v3, v0}, Lcom/tencent/liteav/videodecoder/c;->c(ILjava/lang/String;)V

    .line 233
    .line 234
    .line 235
    const-string v0, "VUI: log2_max_mv_length_horizontal"

    .line 236
    .line 237
    const/16 v4, 0xa

    .line 238
    .line 239
    invoke-virtual {p1, v4, v0}, Lcom/tencent/liteav/videodecoder/c;->c(ILjava/lang/String;)V

    .line 240
    .line 241
    .line 242
    const-string v0, "VUI: log2_max_mv_length_vertical"

    .line 243
    .line 244
    invoke-virtual {p1, v4, v0}, Lcom/tencent/liteav/videodecoder/c;->c(ILjava/lang/String;)V

    .line 245
    .line 246
    .line 247
    const-string v0, "VUI: num_reorder_frames"

    .line 248
    .line 249
    invoke-virtual {p1, v3, v0}, Lcom/tencent/liteav/videodecoder/c;->c(ILjava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p1, v2, v1}, Lcom/tencent/liteav/videodecoder/c;->c(ILjava/lang/String;)V

    .line 253
    .line 254
    .line 255
    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;)[B
    .locals 7

    .line 8
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 9
    new-instance v1, Lcom/tencent/liteav/videodecoder/c;

    invoke-direct {v1, p1, v0}, Lcom/tencent/liteav/videodecoder/c;-><init>(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 10
    const-string p1, "NALU type"

    const/16 v2, 0x8

    invoke-virtual {v1, v2, p1}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 11
    const-string p1, "SPS: profile_idc"

    invoke-virtual {v1, v2, p1}, Lcom/tencent/liteav/videodecoder/c;->a(ILjava/lang/String;)J

    move-result-wide v3

    long-to-int p1, v3

    .line 12
    const-string v3, "SPS: constraint_set_0-3_flag and reserved_zero_4bits"

    invoke-virtual {v1, v2, v3}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 13
    const-string v3, "SPS: level_idc"

    invoke-virtual {v1, v2, v3}, Lcom/tencent/liteav/videodecoder/c;->a(ILjava/lang/String;)J

    .line 14
    const-string v3, "SPS: seq_parameter_set_id"

    invoke-virtual {v1, v3}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    const/16 v3, 0x64

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq p1, v3, :cond_0

    const/16 v3, 0x6e

    if-eq p1, v3, :cond_0

    const/16 v3, 0x7a

    if-eq p1, v3, :cond_0

    const/16 v3, 0x90

    if-ne p1, v3, :cond_4

    .line 15
    :cond_0
    const-string p1, "SPS: chroma_format_idc"

    invoke-virtual {v1, p1}, Lcom/tencent/liteav/videodecoder/c;->a(Ljava/lang/String;)I

    move-result p1

    const/4 v3, 0x3

    if-ne p1, v3, :cond_1

    .line 16
    const-string p1, "SPS: residual_color_transform_flag"

    invoke-virtual {v1, v5, p1}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 17
    :cond_1
    const-string p1, "SPS: bit_depth_luma_minus8"

    invoke-virtual {v1, p1}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    .line 18
    const-string p1, "SPS: bit_depth_chroma_minus8"

    invoke-virtual {v1, p1}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    .line 19
    const-string p1, "SPS: qpprime_y_zero_transform_bypass_flag"

    invoke-virtual {v1, v5, p1}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 20
    const-string p1, "SPS: seq_scaling_matrix_present_lag"

    .line 21
    invoke-virtual {v1, p1}, Lcom/tencent/liteav/videodecoder/c;->d(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    move p1, v4

    :goto_0
    if-ge p1, v2, :cond_4

    .line 22
    const-string v3, "SPS: seqScalingListPresentFlag"

    invoke-virtual {v1, v3}, Lcom/tencent/liteav/videodecoder/c;->d(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v3, 0x6

    if-ge p1, v3, :cond_2

    const/16 v3, 0x10

    .line 23
    invoke-virtual {v1, v3}, Lcom/tencent/liteav/videodecoder/c;->c(I)V

    goto :goto_1

    :cond_2
    const/16 v3, 0x40

    .line 24
    invoke-virtual {v1, v3}, Lcom/tencent/liteav/videodecoder/c;->c(I)V

    :cond_3
    :goto_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 25
    :cond_4
    const-string p1, "SPS: log2_max_frame_num_minus4"

    invoke-virtual {v1, p1}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    .line 26
    const-string p1, "SPS: pic_order_cnt_type"

    invoke-virtual {v1, p1}, Lcom/tencent/liteav/videodecoder/c;->a(Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_5

    .line 27
    const-string p1, "SPS: log2_max_pic_order_cnt_lsb_minus4"

    invoke-virtual {v1, p1}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    if-ne p1, v5, :cond_6

    .line 28
    const-string p1, "SPS: delta_pic_order_always_zero_flag"

    invoke-virtual {v1, v5, p1}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 29
    const-string p1, "SPS: offset_for_non_ref_pic"

    invoke-virtual {v1, p1}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    .line 30
    const-string p1, "SPS: offset_for_top_to_bottom_field"

    invoke-virtual {v1, p1}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    .line 31
    const-string p1, "SPS: num_ref_frames_in_pic_order_cnt_cycle"

    .line 32
    invoke-virtual {v1, p1}, Lcom/tencent/liteav/videodecoder/c;->a(Ljava/lang/String;)I

    move-result p1

    move v2, v4

    :goto_2
    if-ge v2, p1, :cond_6

    .line 33
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "SPS: offsetForRefFrame ["

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "]"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 34
    :cond_6
    :goto_3
    const-string p1, "SPS: num_ref_frames"

    invoke-virtual {v1, p1}, Lcom/tencent/liteav/videodecoder/c;->a(Ljava/lang/String;)I

    .line 35
    const-string p1, "SPS: gaps_in_frame_num_value_allowed_flag"

    invoke-virtual {v1, v5, p1}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 36
    const-string p1, "SPS: pic_width_in_mbs_minus1"

    invoke-virtual {v1, p1}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    .line 37
    const-string p1, "SPS: pic_height_in_map_units_minus1"

    invoke-virtual {v1, p1}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    .line 38
    const-string p1, "SPS: frame_mbs_only_flag"

    invoke-virtual {v1, p1}, Lcom/tencent/liteav/videodecoder/c;->d(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 39
    const-string p1, "SPS: mb_adaptive_frame_field_flag"

    invoke-virtual {v1, v5, p1}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 40
    :cond_7
    const-string p1, "SPS: direct_8x8_inference_flag"

    invoke-virtual {v1, v5, p1}, Lcom/tencent/liteav/videodecoder/c;->b(ILjava/lang/String;)V

    .line 41
    const-string p1, "SPS: frame_cropping_flag"

    invoke-virtual {v1, p1}, Lcom/tencent/liteav/videodecoder/c;->d(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 42
    const-string p1, "SPS: frame_crop_left_offset"

    invoke-virtual {v1, p1}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    .line 43
    const-string p1, "SPS: frame_crop_right_offset"

    invoke-virtual {v1, p1}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    .line 44
    const-string p1, "SPS: frame_crop_top_offset"

    invoke-virtual {v1, p1}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    .line 45
    const-string p1, "SPS: frame_crop_bottom_offset"

    invoke-virtual {v1, p1}, Lcom/tencent/liteav/videodecoder/c;->b(Ljava/lang/String;)V

    .line 46
    :cond_8
    const-string p1, "SPS: vui_parameters_present_flag"

    invoke-virtual {v1, p1}, Lcom/tencent/liteav/videodecoder/c;->e(Ljava/lang/String;)Z

    move-result p1

    .line 47
    const-string v2, "VUI set 1: "

    if-eqz p1, :cond_9

    .line 48
    invoke-virtual {v1, v5, v2}, Lcom/tencent/liteav/videodecoder/c;->a(ZLjava/lang/String;)V

    .line 49
    invoke-direct {p0, v1}, Lcom/tencent/liteav/videodecoder/d;->b(Lcom/tencent/liteav/videodecoder/c;)V

    goto :goto_4

    .line 50
    :cond_9
    invoke-virtual {v1, v5, v2}, Lcom/tencent/liteav/videodecoder/c;->a(ZLjava/lang/String;)V

    .line 51
    const-string p1, "VUI: aspect_ratio_info_present_flag"

    invoke-virtual {v1, v4, p1}, Lcom/tencent/liteav/videodecoder/c;->a(ZLjava/lang/String;)V

    .line 52
    const-string p1, "VUI: overscan_info_present_flag"

    invoke-virtual {v1, v4, p1}, Lcom/tencent/liteav/videodecoder/c;->a(ZLjava/lang/String;)V

    .line 53
    const-string p1, "VUI: video_signal_type_present_flag"

    invoke-virtual {v1, v4, p1}, Lcom/tencent/liteav/videodecoder/c;->a(ZLjava/lang/String;)V

    .line 54
    const-string p1, "VUI: chroma_loc_info_present_flag"

    invoke-virtual {v1, v4, p1}, Lcom/tencent/liteav/videodecoder/c;->a(ZLjava/lang/String;)V

    .line 55
    const-string p1, "VUI: timing_info_present_flag"

    invoke-virtual {v1, v4, p1}, Lcom/tencent/liteav/videodecoder/c;->a(ZLjava/lang/String;)V

    .line 56
    const-string p1, "VUI: nal_hrd_parameters_present_flag"

    invoke-virtual {v1, v4, p1}, Lcom/tencent/liteav/videodecoder/c;->a(ZLjava/lang/String;)V

    .line 57
    const-string p1, "VUI: vcl_hrd_parameters_present_flag"

    invoke-virtual {v1, v4, p1}, Lcom/tencent/liteav/videodecoder/c;->a(ZLjava/lang/String;)V

    .line 58
    const-string p1, "VUI: pic_struct_present_flag"

    invoke-virtual {v1, v4, p1}, Lcom/tencent/liteav/videodecoder/c;->a(ZLjava/lang/String;)V

    .line 59
    const-string p1, "VUI: bitstream_restriction_flag"

    invoke-virtual {v1, v5, p1}, Lcom/tencent/liteav/videodecoder/c;->a(ZLjava/lang/String;)V

    .line 60
    const-string p1, "VUI: motion_vectors_over_pic_boundaries_flag"

    invoke-virtual {v1, v5, p1}, Lcom/tencent/liteav/videodecoder/c;->a(ZLjava/lang/String;)V

    .line 61
    const-string p1, "VUI: max_bytes_per_pic_denom"

    invoke-virtual {v1, v4, p1}, Lcom/tencent/liteav/videodecoder/c;->c(ILjava/lang/String;)V

    .line 62
    const-string p1, "VUI: max_bits_per_mb_denom"

    invoke-virtual {v1, v4, p1}, Lcom/tencent/liteav/videodecoder/c;->c(ILjava/lang/String;)V

    .line 63
    const-string p1, "VUI: log2_max_mv_length_horizontal"

    const/16 v2, 0xa

    invoke-virtual {v1, v2, p1}, Lcom/tencent/liteav/videodecoder/c;->c(ILjava/lang/String;)V

    .line 64
    const-string p1, "VUI: log2_max_mv_length_vertical"

    invoke-virtual {v1, v2, p1}, Lcom/tencent/liteav/videodecoder/c;->c(ILjava/lang/String;)V

    .line 65
    const-string p1, "VUI: num_reorder_frames"

    invoke-virtual {v1, v4, p1}, Lcom/tencent/liteav/videodecoder/c;->c(ILjava/lang/String;)V

    .line 66
    const-string p1, "VUI: max_dec_frame_buffering"

    invoke-virtual {v1, v5, p1}, Lcom/tencent/liteav/videodecoder/c;->c(ILjava/lang/String;)V

    .line 67
    :goto_4
    invoke-virtual {v1}, Lcom/tencent/liteav/videodecoder/c;->c()V

    .line 68
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    .line 69
    iget-boolean v0, p0, Lcom/tencent/liteav/videodecoder/d;->a:Z

    if-eqz v0, :cond_b

    .line 70
    const-string v0, ""

    :goto_5
    array-length v1, p1

    if-ge v4, v1, :cond_b

    .line 71
    aget-byte v1, p1, v4

    and-int/lit16 v1, v1, 0xff

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    .line 72
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-ne v2, v5, :cond_a

    .line 73
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "0"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 74
    :cond_a
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_b
    return-object p1
.end method

.method public a([B)[B
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/videodecoder/d;->a:Z

    if-eqz v0, :cond_1

    .line 2
    const-string v0, ""

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 3
    aget-byte v2, p1, v1

    and-int/lit16 v2, v2, 0xff

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    .line 5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "0"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 6
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 7
    :cond_1
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/videodecoder/d;->a(Ljava/io/InputStream;)[B

    move-result-object p1

    return-object p1
.end method
