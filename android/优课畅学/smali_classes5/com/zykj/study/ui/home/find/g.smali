.class public final synthetic Lcom/zykj/study/ui/home/find/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Landroid/content/DialogInterface;

.field public final synthetic b:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/zykj/study/bean/OssData;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/ui/home/find/g;->a:Landroid/content/DialogInterface;

    iput-object p2, p0, Lcom/zykj/study/ui/home/find/g;->b:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    iput-object p3, p0, Lcom/zykj/study/ui/home/find/g;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/zykj/study/ui/home/find/g;->d:Lcom/zykj/study/bean/OssData;

    iput-object p5, p0, Lcom/zykj/study/ui/home/find/g;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/g;->a:Landroid/content/DialogInterface;

    iget-object v1, p0, Lcom/zykj/study/ui/home/find/g;->b:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    iget-object v2, p0, Lcom/zykj/study/ui/home/find/g;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/zykj/study/ui/home/find/g;->d:Lcom/zykj/study/bean/OssData;

    iget-object v4, p0, Lcom/zykj/study/ui/home/find/g;->e:Ljava/lang/String;

    move-object v5, p1

    check-cast v5, Landroidx/work/WorkInfo;

    invoke-static/range {v0 .. v5}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->k(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;Landroidx/work/WorkInfo;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
