.class public final synthetic Lu5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu3/c;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu5/b;->a:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Date;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/b;->a:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1, p2}, Lcom/zykj/evaluation/ui/datepicker/DatePickerFragment;->m(Lkotlin/jvm/functions/Function1;Ljava/util/Date;Landroid/view/View;)V

    return-void
.end method
