.class public Lq/u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lq/u$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lq/u$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lq/u$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lq/u$a;->a:Lq/u$a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a()Lq/u$a;
    .locals 1

    .line 1
    sget-object v0, Lq/u$a;->a:Lq/u$a;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public b(Lq/q;)Lq/m;
    .locals 0

    .line 1
    invoke-static {}, Lq/u;->c()Lq/u;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
