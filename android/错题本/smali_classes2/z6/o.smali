.class public final Lz6/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz6/h;


# instance fields
.field public final synthetic a:I

.field public final b:Lz6/h;

.field public final c:Lr6/c;


# direct methods
.method public constructor <init>(Lz6/h;Lr6/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lz6/o;->a:I

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lz6/o;->b:Lz6/h;

    .line 10
    .line 11
    iput-object p2, p0, Lz6/o;->c:Lr6/c;

    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    const-string/jumbo p3, "sequence"

    .line 15
    .line 16
    .line 17
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lz6/o;->b:Lz6/h;

    .line 24
    .line 25
    iput-object p2, p0, Lz6/o;->c:Lr6/c;

    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget v0, p0, Lz6/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lz6/p;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lz6/p;-><init>(Lz6/o;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Lz6/e;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lz6/e;-><init>(Lz6/o;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
