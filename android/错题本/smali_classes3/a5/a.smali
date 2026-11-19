.class public final synthetic La5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:La5/e;

.field public final synthetic b:Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;

.field public final synthetic c:Landroid/app/Dialog;


# direct methods
.method public synthetic constructor <init>(La5/e;Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;Landroid/app/Dialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La5/a;->a:La5/e;

    iput-object p2, p0, La5/a;->b:Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;

    iput-object p3, p0, La5/a;->c:Landroid/app/Dialog;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, La5/a;->a:La5/e;

    .line 2
    .line 3
    iget-object p1, p1, La5/e;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Lcom/zykj/mistake/activity/a;

    .line 6
    .line 7
    iget-object v0, p0, La5/a;->b:Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lcom/zykj/mistake/activity/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, La5/a;->c:Landroid/app/Dialog;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 15
    .line 16
    .line 17
    return-void
.end method
