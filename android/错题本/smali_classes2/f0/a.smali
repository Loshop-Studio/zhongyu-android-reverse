.class public final Lf0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf0/q;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/content/res/AssetManager;


# direct methods
.method public synthetic constructor <init>(Landroid/content/res/AssetManager;I)V
    .locals 0

    .line 1
    iput p2, p0, Lf0/a;->a:I

    iput-object p1, p0, Lf0/a;->b:Landroid/content/res/AssetManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final r(Lf0/x;)Lf0/p;
    .locals 1

    .line 1
    iget p1, p0, Lf0/a;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lf0/b;

    .line 7
    .line 8
    iget-object v0, p0, Lf0/a;->b:Landroid/content/res/AssetManager;

    .line 9
    .line 10
    invoke-direct {p1, v0, p0}, Lf0/b;-><init>(Landroid/content/res/AssetManager;Lf0/a;)V

    .line 11
    .line 12
    .line 13
    return-object p1

    .line 14
    :pswitch_0
    new-instance p1, Lf0/b;

    .line 15
    .line 16
    iget-object v0, p0, Lf0/a;->b:Landroid/content/res/AssetManager;

    .line 17
    .line 18
    invoke-direct {p1, v0, p0}, Lf0/b;-><init>(Landroid/content/res/AssetManager;Lf0/a;)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
