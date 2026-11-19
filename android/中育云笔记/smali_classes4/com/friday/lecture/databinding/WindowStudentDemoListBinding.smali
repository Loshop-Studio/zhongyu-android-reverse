.class public abstract Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final c:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final d:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final e:Landroidx/cardview/widget/CardView;

.field public final f:Landroid/widget/ImageView;

.field public final g:Lcom/friday/lecture/databinding/LayoutRandomBinding;

.field public final h:Landroidx/recyclerview/widget/RecyclerView;

.field public final i:Landroidx/recyclerview/widget/RecyclerView;

.field public final j:Landroid/widget/TextView;

.field public final k:Landroid/widget/TextView;

.field public final l:Landroid/widget/TextView;

.field public final m:Landroid/widget/TextView;

.field public final n:Landroid/widget/TextView;

.field public final o:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/cardview/widget/CardView;Landroid/widget/ImageView;Lcom/friday/lecture/databinding/LayoutRandomBinding;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 5
    .line 6
    iput-object p5, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 7
    .line 8
    iput-object p6, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->e:Landroidx/cardview/widget/CardView;

    .line 9
    .line 10
    iput-object p7, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->f:Landroid/widget/ImageView;

    .line 11
    .line 12
    iput-object p8, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->g:Lcom/friday/lecture/databinding/LayoutRandomBinding;

    .line 13
    .line 14
    iput-object p9, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 15
    .line 16
    iput-object p10, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    iput-object p11, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->j:Landroid/widget/TextView;

    .line 19
    .line 20
    iput-object p12, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->k:Landroid/widget/TextView;

    .line 21
    .line 22
    iput-object p13, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->l:Landroid/widget/TextView;

    .line 23
    .line 24
    iput-object p14, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->m:Landroid/widget/TextView;

    .line 25
    .line 26
    iput-object p15, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->n:Landroid/widget/TextView;

    .line 27
    .line 28
    move-object/from16 p1, p16

    .line 29
    .line 30
    iput-object p1, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->o:Landroid/widget/TextView;

    .line 31
    .line 32
    return-void
.end method

.method public static a(Landroid/view/View;)Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0}, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->c(Landroid/view/View;Ljava/lang/Object;)Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static c(Landroid/view/View;Ljava/lang/Object;)Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;
    .locals 1

    .line 1
    sget v0, Lcom/friday/lecture/R$layout;->window_student_demo_list:I

    .line 2
    .line 3
    invoke-static {p1, p0, v0}, Landroidx/databinding/ViewDataBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 8
    .line 9
    return-object p0
.end method
