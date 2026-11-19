.class public final synthetic Lkb/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkb/u0;->c:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lkb/u0;->c:Ljava/io/File;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardFragment;->M(Ljava/io/File;Ljava/lang/String;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
