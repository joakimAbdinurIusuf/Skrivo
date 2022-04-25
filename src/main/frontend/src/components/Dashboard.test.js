import React from "react";
import Sidebar from "./Sidebar";
import {render, screen} from "@testing-library/react";
import Flow from "./Flow";


test("find network graph text", () => {
    const {getByText} = render(<Flow/>);
    const linkElement = getByText(/center node/i);
    expect(linkElement).toBeInTheDocument();
});

test("find sidebar text", () => {
    const {getByText} = render(<Sidebar/>);
    const linkElement = getByText(/Messages/i);
    expect(linkElement).toBeInTheDocument();
});

global.ResizeObserver = require('resize-observer-polyfill')