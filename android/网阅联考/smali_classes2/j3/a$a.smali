.class public final Lj3/a$a;
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
    name = "a"
.end annotation


# static fields
.field public static final a:Lj3/a$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lj3/a$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lj3/a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lj3/a$a;->a:Lj3/a$a;

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
    invoke-virtual {p0, p1}, Lj3/a$a;->b(Lr2/b0;)Lr2/b0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b(Lr2/b0;)Lr2/b0;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p1}, Lj3/i0;->a(Lr2/b0;)Lr2/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    invoke-virtual {p1}, Lr2/b0;->close()V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    invoke-virtual {p1}, Lr2/b0;->close()V

    .line 11
    .line 12
    .line 13
    throw v0
.end method
