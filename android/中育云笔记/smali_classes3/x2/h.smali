.class public final synthetic Lx2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/fragment/app/FragmentManager$OnBackStackChangedListener;


# instance fields
.field public final synthetic a:Lcom/friday/document/view/share/ShareByTeacherFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/share/ShareByTeacherFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx2/h;->a:Lcom/friday/document/view/share/ShareByTeacherFragment;

    return-void
.end method


# virtual methods
.method public final onBackStackChanged()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/h;->a:Lcom/friday/document/view/share/ShareByTeacherFragment;

    invoke-static {v0}, Lcom/friday/document/view/share/ShareByTeacherFragment;->t(Lcom/friday/document/view/share/ShareByTeacherFragment;)V

    return-void
.end method
