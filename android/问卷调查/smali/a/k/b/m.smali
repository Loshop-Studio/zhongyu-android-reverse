.class public La/k/b/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;
.implements La/m/g;
.implements La/m/u;
.implements La/p/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/k/b/m$b;,
        La/k/b/m$e;,
        La/k/b/m$c;,
        La/k/b/m$d;
    }
.end annotation


# static fields
.field public static final U:Ljava/lang/Object;


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:Z

.field public E:Z

.field public F:Landroid/view/ViewGroup;

.field public G:Landroid/view/View;

.field public H:Z

.field public I:Z

.field public J:La/k/b/m$b;

.field public K:Z

.field public L:F

.field public M:Landroid/view/LayoutInflater;

.field public N:Z

.field public O:La/m/d$b;

.field public P:La/m/h;

.field public Q:La/k/b/x0;

.field public R:La/m/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/m/l<",
            "La/m/g;",
            ">;"
        }
    .end annotation
.end field

.field public S:La/p/b;

.field public final T:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/k/b/m$d;",
            ">;"
        }
    .end annotation
.end field

.field public b:I

.field public c:Landroid/os/Bundle;

.field public d:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation
.end field

.field public e:Landroid/os/Bundle;

.field public f:Ljava/lang/Boolean;

.field public g:Ljava/lang/String;

.field public h:Landroid/os/Bundle;

.field public i:La/k/b/m;

.field public j:Ljava/lang/String;

.field public k:I

.field public l:Ljava/lang/Boolean;

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:I

.field public t:La/k/b/c0;

.field public u:La/k/b/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/k/b/z<",
            "*>;"
        }
    .end annotation
.end field

.field public v:La/k/b/c0;

.field public w:La/k/b/m;

.field public x:I

.field public y:I

.field public z:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/k/b/m;->U:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, La/k/b/m;->b:I

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, La/k/b/m;->g:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, La/k/b/m;->j:Ljava/lang/String;

    iput-object v0, p0, La/k/b/m;->l:Ljava/lang/Boolean;

    new-instance v0, La/k/b/d0;

    invoke-direct {v0}, La/k/b/d0;-><init>()V

    iput-object v0, p0, La/k/b/m;->v:La/k/b/c0;

    const/4 v0, 0x1

    iput-boolean v0, p0, La/k/b/m;->D:Z

    iput-boolean v0, p0, La/k/b/m;->I:Z

    sget-object v0, La/m/d$b;->f:La/m/d$b;

    iput-object v0, p0, La/k/b/m;->O:La/m/d$b;

    new-instance v0, La/m/l;

    invoke-direct {v0}, La/m/l;-><init>()V

    iput-object v0, p0, La/k/b/m;->R:La/m/l;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La/k/b/m;->T:Ljava/util/ArrayList;

    .line 1
    new-instance v0, La/m/h;

    invoke-direct {v0, p0}, La/m/h;-><init>(La/m/g;)V

    iput-object v0, p0, La/k/b/m;->P:La/m/h;

    .line 2
    new-instance v0, La/p/b;

    invoke-direct {v0, p0}, La/p/b;-><init>(La/p/c;)V

    .line 3
    iput-object v0, p0, La/k/b/m;->S:La/p/b;

    return-void
.end method


# virtual methods
.method public A()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, La/k/b/m;->J:La/k/b/m$b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method public B()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, La/k/b/m;->J:La/k/b/m$b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, v0, La/k/b/m$b;->m:Ljava/lang/Object;

    sget-object v2, La/k/b/m;->U:Ljava/lang/Object;

    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, La/k/b/m;->A()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    return-object v1
.end method

.method public final C(I)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, La/k/b/m;->y()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final D()Z
    .locals 1

    iget v0, p0, La/k/b/m;->s:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public E()Z
    .locals 2

    iget-object v0, p0, La/k/b/m;->J:La/k/b/m$b;

    const/4 v1, 0x0

    return v1
.end method

.method public final F()Z
    .locals 2

    .line 1
    iget-object v0, p0, La/k/b/m;->w:La/k/b/m;

    if-eqz v0, :cond_1

    .line 2
    iget-boolean v1, v0, La/k/b/m;->n:Z

    if-nez v1, :cond_0

    .line 3
    invoke-virtual {v0}, La/k/b/m;->F()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public G()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, La/k/b/m;->E:Z

    return-void
.end method

.method public H(IILandroid/content/Intent;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x2

    invoke-static {v0}, La/k/b/c0;->N(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " received the following in onActivityResult(): requestCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " resultCode: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " data: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "FragmentManager"

    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public I()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, La/k/b/m;->E:Z

    return-void
.end method

.method public J(Landroid/content/Context;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, La/k/b/m;->E:Z

    iget-object p1, p0, La/k/b/m;->u:La/k/b/z;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 1
    :cond_0
    iget-object p1, p1, La/k/b/z;->b:Landroid/app/Activity;

    :goto_0
    if-eqz p1, :cond_1

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, La/k/b/m;->E:Z

    invoke-virtual {p0}, La/k/b/m;->I()V

    :cond_1
    return-void
.end method

.method public K()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public L()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public M(Landroid/os/Bundle;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, La/k/b/m;->E:Z

    if-eqz p1, :cond_0

    const-string v1, "android:support:fragments"

    .line 1
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v1, p0, La/k/b/m;->v:La/k/b/c0;

    invoke-virtual {v1, p1}, La/k/b/c0;->a0(Landroid/os/Parcelable;)V

    iget-object p1, p0, La/k/b/m;->v:La/k/b/c0;

    invoke-virtual {p1}, La/k/b/c0;->m()V

    .line 2
    :cond_0
    iget-object p1, p0, La/k/b/m;->v:La/k/b/c0;

    .line 3
    iget v1, p1, La/k/b/c0;->p:I

    if-lt v1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    .line 4
    invoke-virtual {p1}, La/k/b/c0;->m()V

    :cond_2
    return-void
.end method

.method public N()Landroid/view/animation/Animation;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public O()Landroid/animation/Animator;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public P(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public Q()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, La/k/b/m;->E:Z

    return-void
.end method

.method public R()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, La/k/b/m;->E:Z

    return-void
.end method

.method public S()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, La/k/b/m;->E:Z

    return-void
.end method

.method public T(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 0

    invoke-virtual {p0}, La/k/b/m;->r()Landroid/view/LayoutInflater;

    move-result-object p1

    return-object p1
.end method

.method public U()V
    .locals 0

    return-void
.end method

.method public V()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, La/k/b/m;->E:Z

    return-void
.end method

.method public W(Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, La/k/b/m;->E:Z

    iget-object p1, p0, La/k/b/m;->u:La/k/b/z;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 1
    :cond_0
    iget-object p1, p1, La/k/b/z;->b:Landroid/app/Activity;

    :goto_0
    if-eqz p1, :cond_1

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, La/k/b/m;->E:Z

    invoke-virtual {p0}, La/k/b/m;->V()V

    :cond_1
    return-void
.end method

.method public X()V
    .locals 0

    return-void
.end method

.method public Y()V
    .locals 0

    return-void
.end method

.method public Z()V
    .locals 0

    return-void
.end method

.method public a()La/m/d;
    .locals 1

    iget-object v0, p0, La/k/b/m;->P:La/m/h;

    return-object v0
.end method

.method public a0()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public b()La/k/b/v;
    .locals 1

    new-instance v0, La/k/b/m$a;

    invoke-direct {v0, p0}, La/k/b/m$a;-><init>(La/k/b/m;)V

    return-object v0
.end method

.method public b0(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public c0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, La/k/b/m;->E:Z

    return-void
.end method

.method public final d()La/p/a;
    .locals 1

    iget-object v0, p0, La/k/b/m;->S:La/p/b;

    .line 1
    iget-object v0, v0, La/p/b;->b:La/p/a;

    return-object v0
.end method

.method public d0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, La/k/b/m;->E:Z

    return-void
.end method

.method public e()La/m/t;
    .locals 3

    iget-object v0, p0, La/k/b/m;->t:La/k/b/c0;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, La/k/b/m;->s()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, La/k/b/m;->t:La/k/b/c0;

    .line 1
    iget-object v0, v0, La/k/b/c0;->J:La/k/b/f0;

    .line 2
    iget-object v1, v0, La/k/b/f0;->d:Ljava/util/HashMap;

    iget-object v2, p0, La/k/b/m;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/m/t;

    if-nez v1, :cond_0

    new-instance v1, La/m/t;

    invoke-direct {v1}, La/m/t;-><init>()V

    iget-object v0, v0, La/k/b/f0;->d:Ljava/util/HashMap;

    iget-object v2, p0, La/k/b/m;->g:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1

    .line 3
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t access ViewModels from detached fragment"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentId=#"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, La/k/b/m;->x:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mContainerId=#"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, La/k/b/m;->y:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mTag="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, La/k/b/m;->z:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, La/k/b/m;->b:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, " mWho="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, La/k/b/m;->g:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mBackStackNesting="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, La/k/b/m;->s:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAdded="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, La/k/b/m;->m:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mRemoving="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, La/k/b/m;->n:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mFromLayout="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, La/k/b/m;->o:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mInLayout="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, La/k/b/m;->p:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mHidden="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, La/k/b/m;->A:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mDetached="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, La/k/b/m;->B:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mMenuVisible="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, La/k/b/m;->D:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mHasMenu="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mRetainInstance="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, La/k/b/m;->C:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mUserVisibleHint="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, La/k/b/m;->I:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    iget-object v0, p0, La/k/b/m;->t:La/k/b/c0;

    if-eqz v0, :cond_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentManager="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, La/k/b/m;->t:La/k/b/c0;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, La/k/b/m;->u:La/k/b/z;

    if-eqz v0, :cond_1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mHost="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, La/k/b/m;->u:La/k/b/z;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_1
    iget-object v0, p0, La/k/b/m;->w:La/k/b/m;

    if-eqz v0, :cond_2

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mParentFragment="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, La/k/b/m;->w:La/k/b/m;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_2
    iget-object v0, p0, La/k/b/m;->h:Landroid/os/Bundle;

    if-eqz v0, :cond_3

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mArguments="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, La/k/b/m;->h:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_3
    iget-object v0, p0, La/k/b/m;->c:Landroid/os/Bundle;

    if-eqz v0, :cond_4

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedFragmentState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, La/k/b/m;->c:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_4
    iget-object v0, p0, La/k/b/m;->d:Landroid/util/SparseArray;

    if-eqz v0, :cond_5

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedViewState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, La/k/b/m;->d:Landroid/util/SparseArray;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_5
    iget-object v0, p0, La/k/b/m;->e:Landroid/os/Bundle;

    if-eqz v0, :cond_6

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedViewRegistryState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, La/k/b/m;->e:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1
    :cond_6
    iget-object v0, p0, La/k/b/m;->i:La/k/b/m;

    if-eqz v0, :cond_7

    goto :goto_0

    :cond_7
    iget-object v0, p0, La/k/b/m;->t:La/k/b/c0;

    if-eqz v0, :cond_8

    iget-object v1, p0, La/k/b/m;->j:Ljava/lang/String;

    if-eqz v1, :cond_8

    .line 2
    iget-object v0, v0, La/k/b/c0;->c:La/k/b/k0;

    invoke-virtual {v0, v1}, La/k/b/k0;->d(Ljava/lang/String;)La/k/b/m;

    move-result-object v0

    goto :goto_0

    :cond_8
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_9

    .line 3
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mTarget="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    const-string v0, " mTargetRequestCode="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, La/k/b/m;->k:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_9
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mPopDirection="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, La/k/b/m;->u()Z

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p0}, La/k/b/m;->l()I

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getEnterAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, La/k/b/m;->l()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_a
    invoke-virtual {p0}, La/k/b/m;->o()I

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getExitAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, La/k/b/m;->o()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_b
    invoke-virtual {p0}, La/k/b/m;->v()I

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getPopEnterAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, La/k/b/m;->v()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_c
    invoke-virtual {p0}, La/k/b/m;->w()I

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getPopExitAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, La/k/b/m;->w()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_d
    iget-object v0, p0, La/k/b/m;->F:Landroid/view/ViewGroup;

    if-eqz v0, :cond_e

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mContainer="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, La/k/b/m;->F:Landroid/view/ViewGroup;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_e
    iget-object v0, p0, La/k/b/m;->G:Landroid/view/View;

    if-eqz v0, :cond_f

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mView="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, La/k/b/m;->G:Landroid/view/View;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_f
    invoke-virtual {p0}, La/k/b/m;->i()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAnimatingAway="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, La/k/b/m;->i()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_10
    invoke-virtual {p0}, La/k/b/m;->k()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-static {p0}, La/n/a/a;->b(La/m/g;)La/n/a/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, La/n/a/a;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    :cond_11
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Child "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La/k/b/m;->v:La/k/b/c0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object v0, p0, La/k/b/m;->v:La/k/b/c0;

    const-string v1, "  "

    invoke-static {p1, v1}, Lb/a/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3, p4}, La/k/b/c0;->y(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public f0(Landroid/os/Bundle;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, La/k/b/m;->E:Z

    return-void
.end method

.method public final g()La/k/b/m$b;
    .locals 1

    iget-object v0, p0, La/k/b/m;->J:La/k/b/m$b;

    if-nez v0, :cond_0

    new-instance v0, La/k/b/m$b;

    invoke-direct {v0}, La/k/b/m$b;-><init>()V

    iput-object v0, p0, La/k/b/m;->J:La/k/b/m$b;

    :cond_0
    iget-object v0, p0, La/k/b/m;->J:La/k/b/m$b;

    return-object v0
.end method

.method public g0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, La/k/b/m;->v:La/k/b/c0;

    invoke-virtual {v0}, La/k/b/c0;->U()V

    const/4 v0, 0x1

    iput-boolean v0, p0, La/k/b/m;->r:Z

    new-instance v1, La/k/b/x0;

    invoke-virtual {p0}, La/k/b/m;->e()La/m/t;

    move-result-object v2

    invoke-direct {v1, p0, v2}, La/k/b/x0;-><init>(La/k/b/m;La/m/t;)V

    iput-object v1, p0, La/k/b/m;->Q:La/k/b/x0;

    invoke-virtual {p0, p1, p2, p3}, La/k/b/m;->P(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, La/k/b/m;->G:Landroid/view/View;

    if-eqz p1, :cond_0

    iget-object p1, p0, La/k/b/m;->Q:La/k/b/x0;

    invoke-virtual {p1}, La/k/b/x0;->f()V

    iget-object p1, p0, La/k/b/m;->G:Landroid/view/View;

    iget-object p2, p0, La/k/b/m;->Q:La/k/b/x0;

    const p3, 0x7f090250

    .line 1
    invoke-virtual {p1, p3, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2
    iget-object p1, p0, La/k/b/m;->G:Landroid/view/View;

    iget-object p2, p0, La/k/b/m;->Q:La/k/b/x0;

    const p3, 0x7f090252

    .line 3
    invoke-virtual {p1, p3, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 4
    iget-object p1, p0, La/k/b/m;->G:Landroid/view/View;

    iget-object p2, p0, La/k/b/m;->Q:La/k/b/x0;

    const p3, 0x7f090251

    .line 5
    invoke-virtual {p1, p3, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 6
    iget-object p1, p0, La/k/b/m;->R:La/m/l;

    iget-object p2, p0, La/k/b/m;->Q:La/k/b/x0;

    invoke-virtual {p1, p2}, La/m/l;->g(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    iget-object p1, p0, La/k/b/m;->Q:La/k/b/x0;

    .line 7
    iget-object p1, p1, La/k/b/x0;->c:La/m/h;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, La/k/b/m;->Q:La/k/b/x0;

    :goto_1
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Called getViewLifecycleOwner() but onCreateView() returned null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h()La/k/b/p;
    .locals 1

    iget-object v0, p0, La/k/b/m;->u:La/k/b/z;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 1
    :cond_0
    iget-object v0, v0, La/k/b/z;->b:Landroid/app/Activity;

    .line 2
    check-cast v0, La/k/b/p;

    :goto_0
    return-object v0
.end method

.method public h0()V
    .locals 5

    iget-object v0, p0, La/k/b/m;->v:La/k/b/c0;

    const/4 v1, 0x1

    .line 1
    invoke-virtual {v0, v1}, La/k/b/c0;->w(I)V

    .line 2
    iget-object v0, p0, La/k/b/m;->G:Landroid/view/View;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, La/k/b/m;->Q:La/k/b/x0;

    .line 3
    invoke-virtual {v0}, La/k/b/x0;->f()V

    iget-object v0, v0, La/k/b/x0;->c:La/m/h;

    .line 4
    iget-object v0, v0, La/m/h;->b:La/m/d$b;

    .line 5
    sget-object v3, La/m/d$b;->d:La/m/d$b;

    .line 6
    invoke-virtual {v0, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-ltz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, La/k/b/m;->Q:La/k/b/x0;

    sget-object v3, La/m/d$a;->ON_DESTROY:La/m/d$a;

    invoke-virtual {v0, v3}, La/k/b/x0;->b(La/m/d$a;)V

    :cond_1
    iput v1, p0, La/k/b/m;->b:I

    iput-boolean v2, p0, La/k/b/m;->E:Z

    invoke-virtual {p0}, La/k/b/m;->R()V

    iget-boolean v0, p0, La/k/b/m;->E:Z

    if-eqz v0, :cond_3

    invoke-static {p0}, La/n/a/a;->b(La/m/g;)La/n/a/a;

    move-result-object v0

    check-cast v0, La/n/a/b;

    .line 8
    iget-object v0, v0, La/n/a/b;->b:La/n/a/b$b;

    .line 9
    iget-object v1, v0, La/n/a/b$b;->b:La/e/i;

    invoke-virtual {v1}, La/e/i;->g()I

    move-result v1

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_2

    iget-object v4, v0, La/n/a/b$b;->b:La/e/i;

    invoke-virtual {v4, v3}, La/e/i;->h(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/n/a/b$a;

    .line 10
    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 11
    :cond_2
    iput-boolean v2, p0, La/k/b/m;->r:Z

    return-void

    :cond_3
    new-instance v0, La/k/b/b1;

    const-string v1, "Fragment "

    const-string v2, " did not call through to super.onDestroyView()"

    invoke-static {v1, p0, v2}, Lb/a/a/a/a;->c(Ljava/lang/String;La/k/b/m;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, La/k/b/b1;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Landroid/view/View;
    .locals 1

    iget-object v0, p0, La/k/b/m;->J:La/k/b/m$b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, La/k/b/m$b;->a:Landroid/view/View;

    return-object v0
.end method

.method public i0()V
    .locals 1

    invoke-virtual {p0}, La/k/b/m;->onLowMemory()V

    iget-object v0, p0, La/k/b/m;->v:La/k/b/c0;

    invoke-virtual {v0}, La/k/b/c0;->p()V

    return-void
.end method

.method public final j()La/k/b/c0;
    .locals 3

    iget-object v0, p0, La/k/b/m;->u:La/k/b/z;

    if-eqz v0, :cond_0

    iget-object v0, p0, La/k/b/m;->v:La/k/b/c0;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " has not been attached yet."

    invoke-static {v1, p0, v2}, Lb/a/a/a/a;->c(Ljava/lang/String;La/k/b/m;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public j0(Landroid/view/Menu;)Z
    .locals 2

    iget-boolean v0, p0, La/k/b/m;->A:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, La/k/b/m;->v:La/k/b/c0;

    invoke-virtual {v0, p1}, La/k/b/c0;->v(Landroid/view/Menu;)Z

    move-result p1

    or-int/2addr v1, p1

    :cond_0
    return v1
.end method

.method public k()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, La/k/b/m;->u:La/k/b/z;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 1
    :cond_0
    iget-object v0, v0, La/k/b/z;->c:Landroid/content/Context;

    :goto_0
    return-object v0
.end method

.method public final k0()Landroid/content/Context;
    .locals 3

    invoke-virtual {p0}, La/k/b/m;->k()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " not attached to a context."

    invoke-static {v1, p0, v2}, Lb/a/a/a/a;->c(Ljava/lang/String;La/k/b/m;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public l()I
    .locals 1

    iget-object v0, p0, La/k/b/m;->J:La/k/b/m$b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, La/k/b/m$b;->d:I

    return v0
.end method

.method public final l0()Landroid/view/View;
    .locals 3

    .line 1
    iget-object v0, p0, La/k/b/m;->G:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " did not return a View from onCreateView() or this was called before onCreateView()."

    invoke-static {v1, p0, v2}, Lb/a/a/a/a;->c(Ljava/lang/String;La/k/b/m;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public m()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, La/k/b/m;->J:La/k/b/m$b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method public m0(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, La/k/b/m;->g()La/k/b/m$b;

    move-result-object v0

    iput-object p1, v0, La/k/b/m$b;->a:Landroid/view/View;

    return-void
.end method

.method public n()V
    .locals 1

    iget-object v0, p0, La/k/b/m;->J:La/k/b/m$b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public n0(IIII)V
    .locals 1

    iget-object v0, p0, La/k/b/m;->J:La/k/b/m$b;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    if-nez p4, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, La/k/b/m;->g()La/k/b/m$b;

    move-result-object v0

    iput p1, v0, La/k/b/m$b;->d:I

    invoke-virtual {p0}, La/k/b/m;->g()La/k/b/m$b;

    move-result-object p1

    iput p2, p1, La/k/b/m$b;->e:I

    invoke-virtual {p0}, La/k/b/m;->g()La/k/b/m$b;

    move-result-object p1

    iput p3, p1, La/k/b/m$b;->f:I

    invoke-virtual {p0}, La/k/b/m;->g()La/k/b/m$b;

    move-result-object p1

    iput p4, p1, La/k/b/m$b;->g:I

    return-void
.end method

.method public o()I
    .locals 1

    iget-object v0, p0, La/k/b/m;->J:La/k/b/m$b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, La/k/b/m$b;->e:I

    return v0
.end method

.method public o0(Landroid/animation/Animator;)V
    .locals 1

    invoke-virtual {p0}, La/k/b/m;->g()La/k/b/m$b;

    move-result-object v0

    iput-object p1, v0, La/k/b/m$b;->b:Landroid/animation/Animator;

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, La/k/b/m;->E:Z

    return-void
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/k/b/m;->h()La/k/b/p;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Activity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Fragment "

    const-string p3, " not attached to an activity."

    invoke-static {p2, p0, p3}, Lb/a/a/a/a;->c(Ljava/lang/String;La/k/b/m;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onLowMemory()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, La/k/b/m;->E:Z

    return-void
.end method

.method public p()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, La/k/b/m;->J:La/k/b/m$b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method public p0(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, La/k/b/m;->t:La/k/b/c0;

    if-eqz v0, :cond_2

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {v0}, La/k/b/c0;->R()Z

    move-result v0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    .line 2
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Fragment already added and state has been saved"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    iput-object p1, p0, La/k/b/m;->h:Landroid/os/Bundle;

    return-void
.end method

.method public q()V
    .locals 1

    iget-object v0, p0, La/k/b/m;->J:La/k/b/m$b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public q0(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, La/k/b/m;->g()La/k/b/m$b;

    move-result-object p1

    const/4 v0, 0x0

    iput-object v0, p1, La/k/b/m$b;->o:Landroid/view/View;

    return-void
.end method

.method public r()Landroid/view/LayoutInflater;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, La/k/b/m;->u:La/k/b/z;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La/k/b/z;->j()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, La/k/b/m;->v:La/k/b/c0;

    .line 1
    iget-object v1, v1, La/k/b/c0;->f:La/k/b/a0;

    .line 2
    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public r0(Z)V
    .locals 1

    invoke-virtual {p0}, La/k/b/m;->g()La/k/b/m$b;

    move-result-object v0

    iput-boolean p1, v0, La/k/b/m$b;->q:Z

    return-void
.end method

.method public final s()I
    .locals 2

    iget-object v0, p0, La/k/b/m;->O:La/m/d$b;

    sget-object v1, La/m/d$b;->c:La/m/d$b;

    if-eq v0, v1, :cond_1

    iget-object v1, p0, La/k/b/m;->w:La/k/b/m;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p0, La/k/b/m;->w:La/k/b/m;

    invoke-virtual {v1}, La/k/b/m;->s()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0

    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method public s0(Z)V
    .locals 1

    iget-boolean v0, p0, La/k/b/m;->D:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, La/k/b/m;->D:Z

    :cond_0
    return-void
.end method

.method public final t()La/k/b/c0;
    .locals 3

    iget-object v0, p0, La/k/b/m;->t:La/k/b/c0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " not associated with a fragment manager."

    invoke-static {v1, p0, v2}, Lb/a/a/a/a;->c(Ljava/lang/String;La/k/b/m;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public t0(La/k/b/m$e;)V
    .locals 2

    invoke-virtual {p0}, La/k/b/m;->g()La/k/b/m$b;

    iget-object v0, p0, La/k/b/m;->J:La/k/b/m$b;

    iget-object v0, v0, La/k/b/m$b;->p:La/k/b/m$e;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_2

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Trying to set a replacement startPostponedEnterTransition on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    if-eqz p1, :cond_3

    check-cast p1, La/k/b/c0$n;

    .line 1
    iget v0, p1, La/k/b/c0$n;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, La/k/b/c0$n;->c:I

    :cond_3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La/k/b/m;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, La/k/b/m;->x:I

    if-eqz v1, :cond_0

    const-string v1, " id=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, La/k/b/m;->x:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, La/k/b/m;->z:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v1, " tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La/k/b/m;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Z
    .locals 1

    iget-object v0, p0, La/k/b/m;->J:La/k/b/m$b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-boolean v0, v0, La/k/b/m$b;->c:Z

    return v0
.end method

.method public u0(Z)V
    .locals 1

    iget-object v0, p0, La/k/b/m;->J:La/k/b/m$b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, La/k/b/m;->g()La/k/b/m$b;

    move-result-object v0

    iput-boolean p1, v0, La/k/b/m$b;->c:Z

    return-void
.end method

.method public v()I
    .locals 1

    iget-object v0, p0, La/k/b/m;->J:La/k/b/m$b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, La/k/b/m$b;->f:I

    return v0
.end method

.method public v0(Z)V
    .locals 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-boolean v0, p0, La/k/b/m;->I:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x5

    if-nez v0, :cond_1

    if-eqz p1, :cond_1

    iget v0, p0, La/k/b/m;->b:I

    if-ge v0, v3, :cond_1

    iget-object v0, p0, La/k/b/m;->t:La/k/b/c0;

    if-eqz v0, :cond_1

    .line 1
    iget-object v4, p0, La/k/b/m;->u:La/k/b/z;

    if-eqz v4, :cond_0

    iget-boolean v4, p0, La/k/b/m;->m:Z

    if-eqz v4, :cond_0

    move v4, v1

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    if-eqz v4, :cond_1

    .line 2
    iget-boolean v4, p0, La/k/b/m;->N:Z

    if-eqz v4, :cond_1

    invoke-virtual {v0, p0}, La/k/b/c0;->h(La/k/b/m;)La/k/b/j0;

    move-result-object v4

    invoke-virtual {v0, v4}, La/k/b/c0;->V(La/k/b/j0;)V

    :cond_1
    iput-boolean p1, p0, La/k/b/m;->I:Z

    iget v0, p0, La/k/b/m;->b:I

    if-ge v0, v3, :cond_2

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    iput-boolean v1, p0, La/k/b/m;->H:Z

    iget-object v0, p0, La/k/b/m;->c:Landroid/os/Bundle;

    if-eqz v0, :cond_3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, La/k/b/m;->f:Ljava/lang/Boolean;

    :cond_3
    return-void
.end method

.method public w()I
    .locals 1

    iget-object v0, p0, La/k/b/m;->J:La/k/b/m$b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, La/k/b/m$b;->g:I

    return v0
.end method

.method public w0()V
    .locals 1

    iget-object v0, p0, La/k/b/m;->J:La/k/b/m$b;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, La/k/b/m;->g()La/k/b/m$b;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public x()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, La/k/b/m;->J:La/k/b/m$b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, v0, La/k/b/m$b;->l:Ljava/lang/Object;

    sget-object v2, La/k/b/m;->U:Ljava/lang/Object;

    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, La/k/b/m;->p()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    return-object v1
.end method

.method public final y()Landroid/content/res/Resources;
    .locals 1

    invoke-virtual {p0}, La/k/b/m;->k0()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public z()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, La/k/b/m;->J:La/k/b/m$b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, v0, La/k/b/m$b;->k:Ljava/lang/Object;

    sget-object v2, La/k/b/m;->U:Ljava/lang/Object;

    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, La/k/b/m;->m()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    return-object v1
.end method
