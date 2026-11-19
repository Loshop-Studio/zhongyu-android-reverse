.class public final Ll3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj3/i;


# static fields
.field public static final a:Ll3/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ll3/e;

    .line 2
    .line 3
    invoke-direct {v0}, Ll3/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ll3/e;->a:Ll3/e;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lr2/b0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ll3/e;->b(Lr2/b0;)Ljava/lang/Double;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b(Lr2/b0;)Ljava/lang/Double;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lr2/b0;->g()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
