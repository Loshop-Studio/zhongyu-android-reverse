.class public final Lk2/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk2/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk2/n$a;-><init>()V

    return-void
.end method

.method public static synthetic b(Lk2/n$a;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 7
    .line 8
    if-eqz p4, :cond_1

    .line 9
    .line 10
    const/4 p3, 0x1

    .line 11
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lk2/n$a;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static synthetic g(Lk2/n$a;IILjava/lang/Object;)V
    .locals 0

    .line 1
    const/4 p3, 0x1

    .line 2
    and-int/2addr p2, p3

    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    move p1, p3

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lk2/n$a;->f(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 12

    .line 1
    const-string v0, "imagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/friday/common/camera/CameraBean;

    .line 7
    .line 8
    const/16 v10, 0x3c

    .line 9
    .line 10
    const/4 v11, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    move-object v3, p1

    .line 17
    move-object v8, p2

    .line 18
    move v9, p3

    .line 19
    invoke-direct/range {v1 .. v11}, Lcom/friday/common/camera/CameraBean;-><init>(ILjava/lang/String;ZIIZLjava/lang/String;IILkotlin/jvm/internal/n;)V

    .line 20
    .line 21
    .line 22
    const-string p1, "CAMERA_BEAN"

    .line 23
    .line 24
    invoke-static {p1, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-class p2, Lcom/friday/common/camera/CameraActivity;

    .line 37
    .line 38
    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/ActivityUtils;->startActivity(Landroid/os/Bundle;Ljava/lang/Class;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final c(Ljava/lang/String;)I
    .locals 2

    .line 1
    const-string v0, "fileType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x61f

    .line 11
    .line 12
    if-eq v0, v1, :cond_a

    .line 13
    .line 14
    const/16 v1, 0x620

    .line 15
    .line 16
    if-eq v0, v1, :cond_8

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :pswitch_0
    const-string v0, "9"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_0
    sget p1, Lcom/friday/common/R$drawable;->file_type_audio_big:I

    .line 34
    .line 35
    return p1

    .line 36
    :pswitch_1
    const-string v0, "8"

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    sget p1, Lcom/friday/common/R$drawable;->file_type_video_big:I

    .line 46
    .line 47
    return p1

    .line 48
    :pswitch_2
    const-string v0, "7"

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    sget p1, Lcom/friday/common/R$drawable;->file_type_picture_big:I

    .line 58
    .line 59
    return p1

    .line 60
    :pswitch_3
    const-string v0, "6"

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_3

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    sget p1, Lcom/friday/common/R$drawable;->file_type_txt_big:I

    .line 70
    .line 71
    return p1

    .line 72
    :pswitch_4
    const-string v0, "5"

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-nez p1, :cond_4

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_4
    sget p1, Lcom/friday/common/R$drawable;->file_type_pdf_big:I

    .line 82
    .line 83
    return p1

    .line 84
    :pswitch_5
    const-string v0, "4"

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-nez p1, :cond_5

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    sget p1, Lcom/friday/common/R$drawable;->file_type_word_big:I

    .line 94
    .line 95
    return p1

    .line 96
    :pswitch_6
    const-string v0, "3"

    .line 97
    .line 98
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-nez p1, :cond_6

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_6
    sget p1, Lcom/friday/common/R$drawable;->file_type_ppt_big:I

    .line 106
    .line 107
    return p1

    .line 108
    :pswitch_7
    const-string v0, "2"

    .line 109
    .line 110
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-nez p1, :cond_7

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_7
    sget p1, Lcom/friday/common/R$drawable;->file_type_page_big:I

    .line 118
    .line 119
    return p1

    .line 120
    :cond_8
    const-string v0, "11"

    .line 121
    .line 122
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-nez p1, :cond_9

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_9
    sget p1, Lcom/friday/common/R$drawable;->file_type_micro_class_big:I

    .line 130
    .line 131
    return p1

    .line 132
    :cond_a
    const-string v0, "10"

    .line 133
    .line 134
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-nez p1, :cond_b

    .line 139
    .line 140
    :goto_0
    sget p1, Lcom/friday/common/R$drawable;->file_type_page_big:I

    .line 141
    .line 142
    return p1

    .line 143
    :cond_b
    sget p1, Lcom/friday/common/R$drawable;->file_type_excel_big:I

    .line 144
    .line 145
    return p1

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x32
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Ljava/lang/String;)I
    .locals 1

    .line 1
    const-string v0, "fileType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    packed-switch v0, :pswitch_data_1

    .line 14
    .line 15
    .line 16
    goto/16 :goto_0

    .line 17
    .line 18
    :pswitch_0
    const-string v0, "12"

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :cond_0
    sget p1, Lcom/friday/common/R$drawable;->file_type_new_note:I

    .line 29
    .line 30
    return p1

    .line 31
    :pswitch_1
    const-string v0, "11"

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :cond_1
    sget p1, Lcom/friday/common/R$drawable;->file_type_micro_class:I

    .line 42
    .line 43
    return p1

    .line 44
    :pswitch_2
    const-string v0, "10"

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_2

    .line 51
    .line 52
    goto/16 :goto_0

    .line 53
    .line 54
    :cond_2
    sget p1, Lcom/friday/common/R$drawable;->file_type_excel:I

    .line 55
    .line 56
    return p1

    .line 57
    :pswitch_3
    const-string v0, "9"

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-nez p1, :cond_3

    .line 64
    .line 65
    goto/16 :goto_0

    .line 66
    .line 67
    :cond_3
    sget p1, Lcom/friday/common/R$drawable;->file_type_audio:I

    .line 68
    .line 69
    return p1

    .line 70
    :pswitch_4
    const-string v0, "8"

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-nez p1, :cond_4

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    sget p1, Lcom/friday/common/R$drawable;->file_type_video:I

    .line 80
    .line 81
    return p1

    .line 82
    :pswitch_5
    const-string v0, "7"

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-nez p1, :cond_5

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_5
    sget p1, Lcom/friday/common/R$drawable;->file_type_picture:I

    .line 92
    .line 93
    return p1

    .line 94
    :pswitch_6
    const-string v0, "6"

    .line 95
    .line 96
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-nez p1, :cond_6

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_6
    sget p1, Lcom/friday/common/R$drawable;->file_type_txt:I

    .line 104
    .line 105
    return p1

    .line 106
    :pswitch_7
    const-string v0, "5"

    .line 107
    .line 108
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-nez p1, :cond_7

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_7
    sget p1, Lcom/friday/common/R$drawable;->file_type_pdf:I

    .line 116
    .line 117
    return p1

    .line 118
    :pswitch_8
    const-string v0, "4"

    .line 119
    .line 120
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-nez p1, :cond_8

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_8
    sget p1, Lcom/friday/common/R$drawable;->file_type_word:I

    .line 128
    .line 129
    return p1

    .line 130
    :pswitch_9
    const-string v0, "3"

    .line 131
    .line 132
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-nez p1, :cond_9

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_9
    sget p1, Lcom/friday/common/R$drawable;->file_type_ppt:I

    .line 140
    .line 141
    return p1

    .line 142
    :pswitch_a
    const-string v0, "2"

    .line 143
    .line 144
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-nez p1, :cond_a

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_a
    sget p1, Lcom/friday/common/R$drawable;->file_type_page:I

    .line 152
    .line 153
    return p1

    .line 154
    :pswitch_b
    const-string v0, "1"

    .line 155
    .line 156
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    if-nez p1, :cond_b

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_b
    sget p1, Lcom/friday/common/R$drawable;->file_type_note:I

    .line 164
    .line 165
    return p1

    .line 166
    :pswitch_c
    const-string v0, "0"

    .line 167
    .line 168
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-nez p1, :cond_c

    .line 173
    .line 174
    :goto_0
    sget p1, Lcom/friday/common/R$drawable;->file_type_note:I

    .line 175
    .line 176
    return p1

    .line 177
    :cond_c
    sget p1, Lcom/friday/common/R$mipmap;->icon_item_folder:I

    .line 178
    .line 179
    return p1

    .line 180
    nop

    .line 181
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    :pswitch_data_1
    .packed-switch 0x61f
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Landroidx/fragment/app/Fragment;Lhd/l;)V
    .locals 2

    .line 1
    const-string v0, "fragment"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {p2, v1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {p1}, Lk6/f;->b(Landroidx/fragment/app/Fragment;)Lk6/f;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {}, Ll6/d;->c()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {p1, v1}, Lk6/f;->d(I)Lk6/e;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-virtual {p1, v1}, Lk6/e;->d(I)Lk6/e;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1, v0}, Lk6/e;->b(Z)Lk6/e;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {}, Lk2/r;->g()Lk2/r;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p1, v0}, Lk6/e;->c(Ln6/a;)Lk6/e;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-instance v0, Lk2/n$a$a;

    .line 46
    .line 47
    invoke-direct {v0, p2}, Lk2/n$a$a;-><init>(Lhd/l;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lk6/e;->a(Lq6/l;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final f(I)V
    .locals 11

    .line 1
    new-instance v0, Lcom/friday/common/camera/CameraBean;

    .line 2
    .line 3
    const/16 v9, 0x7e

    .line 4
    .line 5
    const/4 v10, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    move v8, p1

    .line 14
    invoke-direct/range {v0 .. v10}, Lcom/friday/common/camera/CameraBean;-><init>(ILjava/lang/String;ZIIZLjava/lang/String;IILkotlin/jvm/internal/n;)V

    .line 15
    .line 16
    .line 17
    const-string p1, "CAMERA_BEAN"

    .line 18
    .line 19
    invoke-static {p1, v0}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-class v0, Lcom/friday/common/camera/CameraActivity;

    .line 32
    .line 33
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ActivityUtils;->startActivity(Landroid/os/Bundle;Ljava/lang/Class;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
