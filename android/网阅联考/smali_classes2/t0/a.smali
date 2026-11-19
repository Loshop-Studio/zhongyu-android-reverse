.class public Lt0/a;
.super Landroid/text/method/PasswordTransformationMethod;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt0/a$a;
    }
.end annotation


# static fields
.field public static a:Lt0/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/text/method/PasswordTransformationMethod;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static getInstance()Landroid/text/method/PasswordTransformationMethod;
    .locals 1

    .line 1
    sget-object v0, Lt0/a;->a:Lt0/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lt0/a;

    .line 7
    .line 8
    invoke-direct {v0}, Lt0/a;-><init>()V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lt0/a;->a:Lt0/a;

    .line 12
    .line 13
    return-object v0
.end method


# virtual methods
.method public getTransformation(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    new-instance p2, Lt0/a$a;

    .line 2
    .line 3
    invoke-direct {p2, p1}, Lt0/a$a;-><init>(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-object p2
.end method
