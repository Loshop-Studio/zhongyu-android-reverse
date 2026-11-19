.class public final Lcom/xuexiang/xui/utils/ShortcutUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final ACTION_ADD_SHORTCUT:Ljava/lang/String; = "com.android.launcher.action.INSTALL_SHORTCUT"


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "u can\'t instantiate me..."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static addPinShortcut(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;ILjava/lang/CharSequence;Ljava/lang/Class;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/Class<",
            "+",
            "Landroid/content/BroadcastReceiver;",
            ">;)Z"
        }
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 2
    invoke-static {p0, p3}, Landroidx/core/graphics/drawable/IconCompat;->d(Landroid/content/Context;I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v5

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p4

    move-object v7, p5

    invoke-static/range {v2 .. v7}, Lcom/xuexiang/xui/utils/ShortcutUtils;->addPinShortcutAboveN(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Ljava/lang/Class;)Z

    move-result p0

    return p0

    .line 3
    :cond_0
    invoke-static {p0, p1, p3, p4}, Lcom/xuexiang/xui/utils/ShortcutUtils;->addShortcutBelowAndroidN(Landroid/content/Context;Ljava/lang/Class;ILjava/lang/CharSequence;)Z

    move-result p0

    return p0
.end method

.method public static addPinShortcutAboveN(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Ljava/lang/Class;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Landroidx/core/graphics/drawable/IconCompat;",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/Class<",
            "+",
            "Landroid/content/BroadcastReceiver;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lr/b;->b(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p0, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p1, "android.intent.action.VIEW"

    .line 3
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 4
    new-instance p1, Lr/a$a;

    invoke-direct {p1, p0, p2}, Lr/a$a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1, p3}, Lr/a$a;->b(Landroidx/core/graphics/drawable/IconCompat;)Lr/a$a;

    move-result-object p1

    .line 6
    invoke-virtual {p1, p4}, Lr/a$a;->e(Ljava/lang/CharSequence;)Lr/a$a;

    move-result-object p1

    .line 7
    invoke-virtual {p1, v0}, Lr/a$a;->c(Landroid/content/Intent;)Lr/a$a;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lr/a$a;->a()Lr/a;

    move-result-object p1

    if-eqz p5, :cond_0

    .line 9
    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2, p0, p5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lr/b;->a(Landroid/content/Context;Lr/a;)Landroid/content/Intent;

    move-result-object p2

    :goto_0
    const/high16 p3, 0x8000000

    .line 10
    invoke-static {p0, v1, p2, p3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p2

    .line 11
    invoke-virtual {p2}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lr/b;->c(Landroid/content/Context;Lr/a;Landroid/content/IntentSender;)Z

    move-result p0

    return p0

    :cond_1
    return v1
.end method

.method public static addShortcutBelowAndroidN(Landroid/content/Context;Ljava/lang/Class;ILjava/lang/CharSequence;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "*>;I",
            "Ljava/lang/CharSequence;",
            ")Z"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.android.launcher.action.INSTALL_SHORTCUT"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "duplicate"

    .line 2
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v2, "android.intent.extra.shortcut.ICON_RESOURCE"

    .line 3
    invoke-static {p0, p2}, Landroid/content/Intent$ShortcutIconResource;->fromContext(Landroid/content/Context;I)Landroid/content/Intent$ShortcutIconResource;

    move-result-object p2

    invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p2, "android.intent.extra.shortcut.NAME"

    .line 4
    invoke-virtual {v1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 5
    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    .line 6
    invoke-virtual {p2, p0, p1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    const-string p1, "android.intent.extra.shortcut.INTENT"

    .line 7
    invoke-virtual {v1, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 8
    invoke-virtual {p0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    move-exception p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    return v0
.end method
