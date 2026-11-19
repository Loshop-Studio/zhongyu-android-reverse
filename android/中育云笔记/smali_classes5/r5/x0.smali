.class public Lr5/x0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static b:Lr5/x0;


# instance fields
.field public a:Lr5/l1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lr5/x0;

    .line 2
    .line 3
    invoke-direct {v0}, Lr5/x0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lr5/x0;->b:Lr5/x0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lr5/x0;->a:Lr5/l1;

    .line 6
    .line 7
    return-void
.end method

.method public static d()Lr5/x0;
    .locals 1

    .line 1
    sget-object v0, Lr5/x0;->b:Lr5/x0;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public a(Lr5/l1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr5/x0;->a:Lr5/l1;

    .line 2
    .line 3
    return-void
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lr5/x0;->a:Lr5/l1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public c()Lr5/l1;
    .locals 1

    .line 1
    iget-object v0, p0, Lr5/x0;->a:Lr5/l1;

    .line 2
    .line 3
    return-object v0
.end method
