// Generated by Karakum - do not modify it manually!

package react.router.dom

import remix.run.router.RelativeRoutingType
import web.html.HTMLFormElement

/**
 * Form props shared by navigations and fetchers
 */
// TODO: Manually fixed, need generation adjustment
sealed external interface SharedFormProps : react.Props, react.dom.html.FormHTMLAttributes<HTMLFormElement> {
    /**
     * The HTTP verb to use when the form is submit. Supports "get", "post",
     * "put", "delete", "patch".
     */
    override var method: web.form.FormMethod? /* HTMLFormMethod */

    /**
     * `<form encType>` - enhancing beyond the normal string type and limiting
     * to the built-in browser supported values
     */
    override var encType: web.form.FormEncType?

    /**
     * Normal `<form action>` but supports React Router's relative paths.
     */
    override var action: react.dom.FormAction?

    /**
     * Determines whether the form action is relative to the route hierarchy or
     * the pathname.  Use this if you want to opt out of navigating the route
     * hierarchy and want to instead route based on /-delimited URL segments
     */
    var relative: RelativeRoutingType?

    /**
     * Prevent the scroll position from resetting to the top of the viewport on
     * completion of the navigation when using the <ScrollRestoration> component
     */
    var preventScrollReset: Boolean?

    /**
     * A function to call when the form is submitted. If you call
     * `event.preventDefault()` then this form will not do anything.
     */
    override var onSubmit: react.dom.events.FormEventHandler<HTMLFormElement>?
}