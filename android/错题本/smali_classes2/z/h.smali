.class public final Lz/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/g;


# static fields
.field public static final c:Lj0/a;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lj0/a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lj0/a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lz/h;->c:Lj0/a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lz/h;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lz/h;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/os/ParcelFileDescriptor;)V
    .locals 2

    const/4 v0, 0x4

    iput v0, p0, Lz/h;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance v0, Lz/h;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, Lz/h;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lz/h;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Lc0/g;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lz/h;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/a;

    invoke-direct {v0, p1, p2}, Lcom/bumptech/glide/load/resource/bitmap/a;-><init>(Ljava/io/InputStream;Lc0/g;)V

    iput-object v0, p0, Lz/h;->b:Ljava/lang/Object;

    const/high16 p1, 0x500000

    .line 6
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/load/resource/bitmap/a;->mark(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lz/h;->a:I

    iput-object p1, p0, Lz/h;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b()V
    .locals 0

    .line 1
    return-void
.end method

.method private final d()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget v0, p0, Lz/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, Lz/h;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lcom/bumptech/glide/load/resource/bitmap/a;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/bitmap/a;->b()V

    .line 12
    .line 13
    .line 14
    :pswitch_1
    return-void

    .line 15
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lz/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lz/h;->e()Landroid/os/ParcelFileDescriptor;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lz/h;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lcom/bumptech/glide/load/resource/bitmap/a;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/bitmap/a;->reset()V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_1
    iget-object v0, p0, Lz/h;->b:Ljava/lang/Object;

    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public e()Landroid/os/ParcelFileDescriptor;
    .locals 5

    .line 1
    iget-object v0, p0, Lz/h;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz/h;

    .line 4
    .line 5
    iget-object v0, v0, Lz/h;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/os/ParcelFileDescriptor;

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget v2, Landroid/system/OsConstants;->SEEK_SET:I

    .line 14
    .line 15
    const-wide/16 v3, 0x0

    .line 16
    .line 17
    invoke-static {v1, v3, v4, v2}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :catch_0
    move-exception v0

    .line 22
    new-instance v1, Ljava/io/IOException;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    throw v1
.end method
