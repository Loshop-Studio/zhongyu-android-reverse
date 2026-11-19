.class public Lt1/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/io/File;

.field public final synthetic b:Lt1/e;


# direct methods
.method public constructor <init>(Lt1/e;Ljava/io/File;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt1/e$a;->b:Lt1/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lt1/e$a;->a:Ljava/io/File;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 2

    .line 1
    iget-object v0, p0, Lt1/e$a;->b:Lt1/e;

    .line 2
    .line 3
    iget-object v1, p0, Lt1/e$a;->a:Ljava/io/File;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lt1/e;->c(Lt1/e;Ljava/io/File;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lt1/e$a;->a()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
