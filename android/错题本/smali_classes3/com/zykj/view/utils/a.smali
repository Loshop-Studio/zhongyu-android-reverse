.class public final synthetic Lcom/zykj/view/utils/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/zykj/view/utils/ImagePicker;

.field public final synthetic c:Landroid/net/Uri;

.field public final synthetic d:Lr6/c;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;ZLr6/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p3, p0, Lcom/zykj/view/utils/a;->a:Z

    iput-object p1, p0, Lcom/zykj/view/utils/a;->b:Lcom/zykj/view/utils/ImagePicker;

    iput-object p2, p0, Lcom/zykj/view/utils/a;->c:Landroid/net/Uri;

    iput-object p4, p0, Lcom/zykj/view/utils/a;->d:Lr6/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-boolean v0, p0, Lcom/zykj/view/utils/a;->a:Z

    iget-object v1, p0, Lcom/zykj/view/utils/a;->b:Lcom/zykj/view/utils/ImagePicker;

    iget-object v2, p0, Lcom/zykj/view/utils/a;->c:Landroid/net/Uri;

    iget-object v3, p0, Lcom/zykj/view/utils/a;->d:Lr6/c;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/zykj/view/utils/ImagePicker;->m(ZLcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;Lr6/c;Z)Ld6/s;

    move-result-object p1

    return-object p1
.end method
