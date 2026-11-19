.class public final synthetic Lu4/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Landroid/content/DialogInterface;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/zykj/study/ui/OpenFileFragment;


# direct methods
.method public synthetic constructor <init>(Landroid/content/DialogInterface;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/ui/OpenFileFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/n;->a:Landroid/content/DialogInterface;

    iput-object p2, p0, Lu4/n;->b:Ljava/lang/String;

    iput-object p3, p0, Lu4/n;->c:Ljava/lang/String;

    iput-object p4, p0, Lu4/n;->d:Lcom/zykj/study/ui/OpenFileFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lu4/n;->a:Landroid/content/DialogInterface;

    iget-object v1, p0, Lu4/n;->b:Ljava/lang/String;

    iget-object v2, p0, Lu4/n;->c:Ljava/lang/String;

    iget-object v3, p0, Lu4/n;->d:Lcom/zykj/study/ui/OpenFileFragment;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/zykj/study/ui/OpenFileFragment;->j(Landroid/content/DialogInterface;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/ui/OpenFileFragment;Ljava/util/List;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
