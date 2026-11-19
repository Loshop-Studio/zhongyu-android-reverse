.class public final synthetic Lw4/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw4/q1;->a:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/q1;->a:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    check-cast p1, Ljava/io/File;

    invoke-static {v0, p1}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->o(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/io/File;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
