.class public final Lg5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Landroid/graphics/Point;

.field public c:Landroid/graphics/Point;

.field public d:Landroid/graphics/Point;

.field public e:Landroid/graphics/Point;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, ","

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lg5/b;->f:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg5/b;->a:Landroid/content/Context;

    .line 5
    .line 6
    return-void
.end method

.method public static a(Ljava/lang/CharSequence;I)I
    .locals 8

    .line 1
    sget-object v0, Lg5/b;->f:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    if-ge v1, v0, :cond_1

    .line 11
    .line 12
    aget-object v3, p0, v1

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    :try_start_0
    invoke-static {v3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 19
    .line 20
    .line 21
    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    const-wide/high16 v5, 0x4024000000000000L    # 10.0

    .line 23
    .line 24
    mul-double/2addr v5, v3

    .line 25
    double-to-int v5, v5

    .line 26
    int-to-double v6, p1

    .line 27
    sub-double/2addr v6, v3

    .line 28
    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    sub-int v6, p1, v2

    .line 33
    .line 34
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    int-to-double v6, v6

    .line 39
    cmpg-double v3, v3, v6

    .line 40
    .line 41
    if-gez v3, :cond_0

    .line 42
    .line 43
    move v2, v5

    .line 44
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catch_0
    return p1

    .line 48
    :cond_1
    return v2
.end method


# virtual methods
.method public b()I
    .locals 5

    .line 1
    new-instance v0, Landroid/hardware/Camera$CameraInfo;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {v1, v0}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Lg5/b;->a:Landroid/content/Context;

    .line 11
    .line 12
    const-string v3, "window"

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Landroid/view/WindowManager;

    .line 19
    .line 20
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Landroid/view/Display;->getRotation()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x1

    .line 29
    if-eqz v2, :cond_3

    .line 30
    .line 31
    if-eq v2, v3, :cond_2

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    if-eq v2, v4, :cond_1

    .line 35
    .line 36
    const/4 v4, 0x3

    .line 37
    if-eq v2, v4, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/16 v1, 0x10e

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/16 v1, 0xb4

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/16 v1, 0x5a

    .line 47
    .line 48
    :cond_3
    :goto_0
    iget v2, v0, Landroid/hardware/Camera$CameraInfo;->facing:I

    .line 49
    .line 50
    if-ne v2, v3, :cond_4

    .line 51
    .line 52
    iget v0, v0, Landroid/hardware/Camera$CameraInfo;->orientation:I

    .line 53
    .line 54
    add-int/2addr v0, v1

    .line 55
    rem-int/lit16 v0, v0, 0x168

    .line 56
    .line 57
    rsub-int v0, v0, 0x168

    .line 58
    .line 59
    rem-int/lit16 v0, v0, 0x168

    .line 60
    .line 61
    return v0

    .line 62
    :cond_4
    iget v0, v0, Landroid/hardware/Camera$CameraInfo;->orientation:I

    .line 63
    .line 64
    sub-int/2addr v0, v1

    .line 65
    add-int/lit16 v0, v0, 0x168

    .line 66
    .line 67
    rem-int/lit16 v0, v0, 0x168

    .line 68
    .line 69
    return v0
.end method

.method public c(Landroid/hardware/Camera;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lg5/b;->a:Landroid/content/Context;

    .line 6
    .line 7
    const-string v1, "window"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/WindowManager;

    .line 14
    .line 15
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Landroid/graphics/Point;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-direct {v1, v2, v0}, Landroid/graphics/Point;-><init>(II)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lg5/b;->b:Landroid/graphics/Point;

    .line 33
    .line 34
    new-instance v0, Landroid/graphics/Point;

    .line 35
    .line 36
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lg5/b;->e:Landroid/graphics/Point;

    .line 40
    .line 41
    iget-object v1, p0, Lg5/b;->b:Landroid/graphics/Point;

    .line 42
    .line 43
    iget v2, v1, Landroid/graphics/Point;->x:I

    .line 44
    .line 45
    iput v2, v0, Landroid/graphics/Point;->x:I

    .line 46
    .line 47
    iget v2, v1, Landroid/graphics/Point;->y:I

    .line 48
    .line 49
    iput v2, v0, Landroid/graphics/Point;->y:I

    .line 50
    .line 51
    iget v2, v1, Landroid/graphics/Point;->x:I

    .line 52
    .line 53
    iget v3, v1, Landroid/graphics/Point;->y:I

    .line 54
    .line 55
    if-ge v2, v3, :cond_0

    .line 56
    .line 57
    iput v3, v0, Landroid/graphics/Point;->x:I

    .line 58
    .line 59
    iget v1, v1, Landroid/graphics/Point;->x:I

    .line 60
    .line 61
    iput v1, v0, Landroid/graphics/Point;->y:I

    .line 62
    .line 63
    :cond_0
    invoke-static {p1, v0}, Li5/a;->a(Landroid/hardware/Camera$Parameters;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, Lg5/b;->d:Landroid/graphics/Point;

    .line 68
    .line 69
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 70
    .line 71
    int-to-float v2, v1

    .line 72
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 73
    .line 74
    int-to-float v3, v0

    .line 75
    div-float/2addr v2, v3

    .line 76
    if-ge v1, v0, :cond_1

    .line 77
    .line 78
    int-to-float v0, v0

    .line 79
    int-to-float v1, v1

    .line 80
    div-float v2, v0, v1

    .line 81
    .line 82
    :cond_1
    iget-object v0, p0, Lg5/b;->e:Landroid/graphics/Point;

    .line 83
    .line 84
    invoke-static {p1, v0, v2}, Li5/a;->b(Landroid/hardware/Camera$Parameters;Landroid/graphics/Point;F)Landroid/graphics/Point;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, p0, Lg5/b;->c:Landroid/graphics/Point;

    .line 89
    .line 90
    new-instance p1, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .line 94
    .line 95
    const-string v0, "best preview size-->x = "

    .line 96
    .line 97
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    iget-object v0, p0, Lg5/b;->c:Landroid/graphics/Point;

    .line 101
    .line 102
    iget v0, v0, Landroid/graphics/Point;->x:I

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v0, ", y ="

    .line 108
    .line 109
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    iget-object v1, p0, Lg5/b;->c:Landroid/graphics/Point;

    .line 113
    .line 114
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 115
    .line 116
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    const-string v1, "ContentValues"

    .line 124
    .line 125
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    new-instance p1, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    const-string v2, "pictureResolution size-->x = "

    .line 134
    .line 135
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget-object v2, p0, Lg5/b;->d:Landroid/graphics/Point;

    .line 139
    .line 140
    iget v2, v2, Landroid/graphics/Point;->x:I

    .line 141
    .line 142
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    iget-object v0, p0, Lg5/b;->d:Landroid/graphics/Point;

    .line 149
    .line 150
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 151
    .line 152
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 160
    .line 161
    .line 162
    return-void
.end method

.method public d(Landroid/hardware/Camera;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lg5/b;->c:Landroid/graphics/Point;

    .line 6
    .line 7
    iget v2, v1, Landroid/graphics/Point;->x:I

    .line 8
    .line 9
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 10
    .line 11
    invoke-virtual {v0, v2, v1}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lg5/b;->d:Landroid/graphics/Point;

    .line 15
    .line 16
    iget v2, v1, Landroid/graphics/Point;->x:I

    .line 17
    .line 18
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 19
    .line 20
    invoke-virtual {v0, v2, v1}, Landroid/hardware/Camera$Parameters;->setPictureSize(II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lg5/b;->e(Landroid/hardware/Camera$Parameters;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lg5/b;->b()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p1, v1}, Landroid/hardware/Camera;->setDisplayOrientation(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final e(Landroid/hardware/Camera$Parameters;)V
    .locals 8

    .line 1
    const-string v0, "zoom-supported"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string v0, "max-zoom"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    .line 23
    .line 24
    const/16 v3, 0x1b

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    :try_start_0
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 29
    .line 30
    .line 31
    move-result-wide v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    mul-double/2addr v4, v1

    .line 33
    double-to-int v4, v4

    .line 34
    if-le v3, v4, :cond_1

    .line 35
    .line 36
    move v3, v4

    .line 37
    :catch_0
    :cond_1
    const-string v4, "taking-picture-zoom-max"

    .line 38
    .line 39
    invoke-virtual {p1, v4}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    :try_start_1
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v5
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 49
    if-le v3, v5, :cond_2

    .line 50
    .line 51
    move v3, v5

    .line 52
    :catch_1
    :cond_2
    const-string v5, "mot-zoom-values"

    .line 53
    .line 54
    invoke-virtual {p1, v5}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    if-eqz v5, :cond_3

    .line 59
    .line 60
    invoke-static {v5, v3}, Lg5/b;->a(Ljava/lang/CharSequence;I)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    :cond_3
    const-string v6, "mot-zoom-step"

    .line 65
    .line 66
    invoke-virtual {p1, v6}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    if-eqz v6, :cond_4

    .line 71
    .line 72
    :try_start_2
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 77
    .line 78
    .line 79
    move-result-wide v6

    .line 80
    mul-double/2addr v6, v1

    .line 81
    double-to-int v6, v6

    .line 82
    const/4 v7, 0x1

    .line 83
    if-le v6, v7, :cond_4

    .line 84
    .line 85
    rem-int v6, v3, v6
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    .line 86
    .line 87
    sub-int/2addr v3, v6

    .line 88
    :catch_2
    :cond_4
    if-nez v0, :cond_5

    .line 89
    .line 90
    if-eqz v5, :cond_6

    .line 91
    .line 92
    :cond_5
    int-to-double v5, v3

    .line 93
    div-double/2addr v5, v1

    .line 94
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const-string v1, "zoom"

    .line 99
    .line 100
    invoke-virtual {p1, v1, v0}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_6
    if-eqz v4, :cond_7

    .line 104
    .line 105
    const-string v0, "taking-picture-zoom"

    .line 106
    .line 107
    invoke-virtual {p1, v0, v3}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;I)V

    .line 108
    .line 109
    .line 110
    :cond_7
    :goto_0
    return-void
.end method
