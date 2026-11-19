.class public abstract Lr4/f;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr4/f$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lr4/f;->a:Ljava/util/Map;

    .line 7
    .line 8
    return-void
.end method

.method public static a()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Lr4/f;->a:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public static b(Ljava/lang/String;Lr4/f$a;)V
    .locals 1

    .line 1
    sget-object v0, Lr4/f;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method
