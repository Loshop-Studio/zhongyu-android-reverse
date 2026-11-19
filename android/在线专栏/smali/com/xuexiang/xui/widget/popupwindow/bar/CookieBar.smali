.class public final Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;,
        Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Builder;
    }
.end annotation


# instance fields
.field private mActivityWeakRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private mCookieView:Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private constructor <init>(Landroid/app/Activity;Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar;->mActivityWeakRef:Ljava/lang/ref/WeakReference;

    .line 5
    new-instance p1, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar;->mCookieView:Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;

    .line 6
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->setParams(Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;)V

    return-void
.end method

.method synthetic constructor <init>(Landroid/app/Activity;Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar;-><init>(Landroid/app/Activity;Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;)V

    return-void
.end method

.method public static builder(Landroid/app/Activity;)Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Builder;
    .locals 1

    new-instance v0, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Builder;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Builder;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method


# virtual methods
.method public dismiss()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar;->mCookieView:Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->dismiss()V

    :cond_0
    return-void
.end method

.method public getActivity()Landroid/app/Activity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar;->mActivityWeakRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar;->mActivityWeakRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public show()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar;->mCookieView:Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const v1, 0x1020002

    .line 3
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar;->mCookieView:Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;

    invoke-virtual {v2}, Landroid/widget/LinearLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_1

    .line 5
    iget-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar;->mCookieView:Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->getLayoutGravity()I

    move-result v2

    const/16 v3, 0x50

    if-ne v2, v3, :cond_0

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar;->mCookieView:Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar;->mCookieView:Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_1
    :goto_0
    return-void
.end method
