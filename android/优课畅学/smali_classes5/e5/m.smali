.class public abstract Le5/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le5/m$a;
    }
.end annotation


# static fields
.field public static final a:Le5/m$a;

.field public static b:Landroid/widget/Toast;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le5/m$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Le5/m$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Le5/m;->a:Le5/m$a;

    .line 8
    .line 9
    return-void
.end method

.method public static final synthetic a()Landroid/widget/Toast;
    .locals 1

    .line 1
    sget-object v0, Le5/m;->b:Landroid/widget/Toast;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic b(Landroid/widget/Toast;)V
    .locals 0

    .line 1
    sput-object p0, Le5/m;->b:Landroid/widget/Toast;

    .line 2
    .line 3
    return-void
.end method
