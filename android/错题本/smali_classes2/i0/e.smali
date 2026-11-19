.class public final Li0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/g;


# instance fields
.field public final synthetic a:I

.field public final b:Li0/m;


# direct methods
.method public synthetic constructor <init>(Li0/m;I)V
    .locals 0

    .line 1
    iput p2, p0, Li0/e;->a:I

    iput-object p1, p0, Li0/e;->b:Li0/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ly/f;)Z
    .locals 0

    .line 1
    iget p2, p0, Li0/e;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/os/ParcelFileDescriptor;

    .line 7
    .line 8
    iget-object p1, p0, Li0/e;->b:Li0/m;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    :goto_0
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :pswitch_0
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    iget-object p1, p0, Li0/e;->b:Li0/m;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;IILy/f;)Lb0/g0;
    .locals 6

    .line 1
    iget v0, p0, Li0/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/os/ParcelFileDescriptor;

    .line 7
    .line 8
    new-instance v1, Lb0/g;

    .line 9
    .line 10
    iget-object v0, p0, Li0/e;->b:Li0/m;

    .line 11
    .line 12
    iget-object v2, v0, Li0/m;->d:Ljava/util/ArrayList;

    .line 13
    .line 14
    iget-object v3, v0, Li0/m;->c:Lc0/g;

    .line 15
    .line 16
    invoke-direct {v1, p1, v2, v3}, Lb0/g;-><init>(Landroid/os/ParcelFileDescriptor;Ljava/util/ArrayList;Lc0/g;)V

    .line 17
    .line 18
    .line 19
    sget-object v5, Li0/m;->k:Lio/reactivex/internal/operators/observable/c;

    .line 20
    .line 21
    move v2, p2

    .line 22
    move v3, p3

    .line 23
    move-object v4, p4

    .line 24
    invoke-virtual/range {v0 .. v5}, Li0/m;->a(Lb0/g;IILy/f;Li0/l;)Li0/c;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :pswitch_0
    move v2, p2

    .line 30
    move v3, p3

    .line 31
    move-object v4, p4

    .line 32
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 33
    .line 34
    sget p2, Lv0/a;->a:I

    .line 35
    .line 36
    new-instance p2, Lcoil3/decode/l;

    .line 37
    .line 38
    invoke-direct {p2, p1}, Lcoil3/decode/l;-><init>(Ljava/nio/ByteBuffer;)V

    .line 39
    .line 40
    .line 41
    sget-object v5, Li0/m;->k:Lio/reactivex/internal/operators/observable/c;

    .line 42
    .line 43
    new-instance v1, Lb0/g;

    .line 44
    .line 45
    iget-object v0, p0, Li0/e;->b:Li0/m;

    .line 46
    .line 47
    iget-object p1, v0, Li0/m;->d:Ljava/util/ArrayList;

    .line 48
    .line 49
    iget-object p3, v0, Li0/m;->c:Lc0/g;

    .line 50
    .line 51
    invoke-direct {v1, p2, p1, p3}, Lb0/g;-><init>(Ljava/io/InputStream;Ljava/util/ArrayList;Lc0/g;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual/range {v0 .. v5}, Li0/m;->a(Lb0/g;IILy/f;Li0/l;)Li0/c;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    return-object p1

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
