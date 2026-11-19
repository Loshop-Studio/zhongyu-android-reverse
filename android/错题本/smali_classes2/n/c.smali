.class public final Ln/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln/g;


# instance fields
.field public final synthetic a:I

.field public final b:Ls/l;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ls/l;I)V
    .locals 0

    .line 1
    iput p3, p0, Ln/c;->a:I

    iput-object p1, p0, Ln/c;->c:Ljava/lang/Object;

    iput-object p2, p0, Ln/c;->b:Ls/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lh6/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget p1, p0, Ln/c;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object v2, p0, Ln/c;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Ln/c;->b:Ls/l;

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v2, Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    sget-object p1, Lcoil3/util/l;->a:[Landroid/graphics/Bitmap$Config;

    .line 15
    .line 16
    instance-of p1, v2, Landroid/graphics/drawable/VectorDrawable;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    instance-of p1, v2, Landroidx/vectordrawable/graphics/drawable/VectorDrawableCompat;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move p1, v1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    move p1, v0

    .line 29
    :goto_1
    new-instance v4, Ln/i;

    .line 30
    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    invoke-static {v3}, Ls/h;->b(Ls/l;)Landroid/graphics/Bitmap$Config;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    iget-object v6, v3, Ls/l;->b:Lt/f;

    .line 38
    .line 39
    iget-object v7, v3, Ls/l;->c:Lcoil3/size/Scale;

    .line 40
    .line 41
    iget-object v8, v3, Ls/l;->d:Lcoil3/size/Precision;

    .line 42
    .line 43
    sget-object v9, Lcoil3/size/Precision;->INEXACT:Lcoil3/size/Precision;

    .line 44
    .line 45
    if-ne v8, v9, :cond_2

    .line 46
    .line 47
    move v1, v0

    .line 48
    :cond_2
    invoke-static {v2, v5, v6, v7, v1}, Lv7/d;->g(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lt/f;Lcoil3/size/Scale;Z)Landroid/graphics/Bitmap;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v1, v3, Ls/l;->a:Landroid/content/Context;

    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    .line 59
    .line 60
    invoke-direct {v2, v1, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    invoke-static {v2}, Lcoil3/o;->c(Landroid/graphics/drawable/Drawable;)Lcoil3/k;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sget-object v1, Lcoil3/decode/DataSource;->MEMORY:Lcoil3/decode/DataSource;

    .line 68
    .line 69
    invoke-direct {v4, v0, p1, v1}, Ln/i;-><init>(Lcoil3/k;ZLcoil3/decode/DataSource;)V

    .line 70
    .line 71
    .line 72
    return-object v4

    .line 73
    :pswitch_0
    new-instance p1, Ln/k;

    .line 74
    .line 75
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 76
    .line 77
    new-instance v1, Ln/d;

    .line 78
    .line 79
    invoke-direct {v1, v2}, Ln/d;-><init>(Ljava/nio/ByteBuffer;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v1}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iget-object v3, v3, Ls/l;->f:Lokio/FileSystem;

    .line 87
    .line 88
    new-instance v4, Lcoil3/decode/e;

    .line 89
    .line 90
    invoke-direct {v4, v2}, Lcoil3/decode/e;-><init>(Ljava/nio/ByteBuffer;)V

    .line 91
    .line 92
    .line 93
    new-instance v2, Lcoil3/decode/r;

    .line 94
    .line 95
    invoke-direct {v2, v1, v3, v4}, Lcoil3/decode/r;-><init>(Lokio/BufferedSource;Lokio/FileSystem;La/a;)V

    .line 96
    .line 97
    .line 98
    sget-object v1, Lcoil3/decode/DataSource;->MEMORY:Lcoil3/decode/DataSource;

    .line 99
    .line 100
    invoke-direct {p1, v2, v0, v1}, Ln/k;-><init>(Lcoil3/decode/p;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 101
    .line 102
    .line 103
    return-object p1

    .line 104
    :pswitch_1
    new-instance p1, Lokio/Buffer;

    .line 105
    .line 106
    invoke-direct {p1}, Lokio/Buffer;-><init>()V

    .line 107
    .line 108
    .line 109
    check-cast v2, [B

    .line 110
    .line 111
    invoke-virtual {p1, v2}, Lokio/Buffer;->write([B)Lokio/Buffer;

    .line 112
    .line 113
    .line 114
    iget-object v1, v3, Ls/l;->f:Lokio/FileSystem;

    .line 115
    .line 116
    new-instance v2, Lcoil3/decode/r;

    .line 117
    .line 118
    invoke-direct {v2, p1, v1, v0}, Lcoil3/decode/r;-><init>(Lokio/BufferedSource;Lokio/FileSystem;La/a;)V

    .line 119
    .line 120
    .line 121
    sget-object p1, Lcoil3/decode/DataSource;->MEMORY:Lcoil3/decode/DataSource;

    .line 122
    .line 123
    new-instance v1, Ln/k;

    .line 124
    .line 125
    invoke-direct {v1, v2, v0, p1}, Ln/k;-><init>(Lcoil3/decode/p;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 126
    .line 127
    .line 128
    return-object v1

    .line 129
    :pswitch_2
    new-instance p1, Ln/i;

    .line 130
    .line 131
    check-cast v2, Landroid/graphics/Bitmap;

    .line 132
    .line 133
    iget-object v0, v3, Ls/l;->a:Landroid/content/Context;

    .line 134
    .line 135
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    .line 140
    .line 141
    invoke-direct {v3, v0, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v3}, Lcoil3/o;->c(Landroid/graphics/drawable/Drawable;)Lcoil3/k;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    sget-object v2, Lcoil3/decode/DataSource;->MEMORY:Lcoil3/decode/DataSource;

    .line 149
    .line 150
    invoke-direct {p1, v0, v1, v2}, Ln/i;-><init>(Lcoil3/k;ZLcoil3/decode/DataSource;)V

    .line 151
    .line 152
    .line 153
    return-object p1

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
