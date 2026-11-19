.class public Lb/c/a/e/e/a;
.super Landroid/text/method/PasswordTransformationMethod;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/c/a/e/e/a$a;
    }
.end annotation


# static fields
.field public static b:Lb/c/a/e/e/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/text/method/PasswordTransformationMethod;-><init>()V

    return-void
.end method


# virtual methods
.method public getTransformation(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;
    .locals 0

    new-instance p2, Lb/c/a/e/e/a$a;

    invoke-direct {p2, p1}, Lb/c/a/e/e/a$a;-><init>(Ljava/lang/CharSequence;)V

    return-object p2
.end method
