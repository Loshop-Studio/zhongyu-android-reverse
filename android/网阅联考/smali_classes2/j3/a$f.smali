.class public final Lj3/a$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj3/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# static fields
.field public static final a:Lj3/a$f;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lj3/a$f;

    .line 2
    .line 3
    invoke-direct {v0}, Lj3/a$f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lj3/a$f;->a:Lj3/a$f;

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
    invoke-virtual {p0, p1}, Lj3/a$f;->b(Lr2/b0;)Ljava/lang/Void;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b(Lr2/b0;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lr2/b0;->close()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    return-object p1
.end method
